package ListaTarefas;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException; // Adicionando o import para a InputMismatchException

public class ListaDeTarefas {
    private static final String ARQUIVO_TAREFAS = System.getProperty("user.dir") + "/tarefas.txt";  // Caminho do arquivo tarefas.txt

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = carregarTarefas(); // Carrega as tarefas do arquivo

        while (true) {
            System.out.println("\nLista de Tarefas:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Visualizar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Sair");

            int opcao = -1;
            // Loop para garantir que o usuário insira uma opção válida
            while (opcao < 1 || opcao > 4) {
                System.out.print("Escolha uma opção (1-4): ");
                try {
                    opcao = scanner.nextInt(); // Lê a opção do usuário
                    scanner.nextLine(); // Consome a nova linha pendente após o nextInt()
                    
                    if (opcao < 1 || opcao > 4) {
                        System.out.println("Opção inválida! Por favor, escolha uma opção entre 1 e 4.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número entre 1 e 4.");
                    scanner.nextLine(); // Limpa o buffer de entrada
                }
            }

            // Processando a escolha do usuário
            switch (opcao) {
                case 1: // Adicionar tarefa
                    System.out.print("Digite a descrição da tarefa: ");
                    String tarefa = scanner.nextLine(); // Lê a tarefa
                    tarefas.add(tarefa); // Adiciona a tarefa à lista
                    salvarTarefas(tarefas); // Salva as tarefas no arquivo
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                
                case 2: // Visualizar tarefas
                    if (tarefas.isEmpty()) {
                        System.out.println("A lista de tarefas está vazia.");
                    } else {
                        System.out.println("\nTarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;
                
                case 3: // Remover tarefa
                    if (tarefas.isEmpty()) {
                        System.out.println("A lista de tarefas está vazia. Não há o que remover.");
                    } else {
                        System.out.print("Digite o número da tarefa a ser removida: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine(); // Consome a nova linha após o nextInt()

                        // Verificando se o índice informado é válido
                        if (indice > 0 && indice <= tarefas.size()) {
                            tarefas.remove(indice - 1); // Remove a tarefa pelo índice
                            salvarTarefas(tarefas); // Salva as tarefas no arquivo
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Índice inválido. Não há tarefa com esse número.");
                        }
                    }
                    break;

                case 4: // Sair
                    System.out.println("Saindo do programa...");
                    salvarTarefas(tarefas); // Salva as tarefas antes de sair
                    scanner.close(); // Fecha o scanner
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }

    // Método para carregar as tarefas do arquivo
    private static ArrayList<String> carregarTarefas() {
        ArrayList<String> tarefas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_TAREFAS))) {
            String tarefa;
            while ((tarefa = br.readLine()) != null) {
                tarefas.add(tarefa);
            }
        } catch (IOException e) {
            // Se o arquivo não existir, não faz nada e retorna a lista vazia
            System.out.println("Nenhuma tarefa anterior encontrada, começando do zero.");
        }
        return tarefas;
    }

    // Método para salvar as tarefas no arquivo
    private static void salvarTarefas(ArrayList<String> tarefas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_TAREFAS))) {
            for (String tarefa : tarefas) {
                bw.write(tarefa);
                bw.newLine(); // Escreve cada tarefa em uma nova linha
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar as tarefas no arquivo.");
        }
    }
}
