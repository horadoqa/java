package ModulosIMC.json;

import java.util.Scanner;

import ModulosIMC.console.IMCCalculadora;
import ModulosIMC.console.Pessoa;

import java.io.FileWriter;
import java.io.IOException;

public class CalculaIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletando dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        int peso = scanner.nextInt();

        // Criando o objeto Pessoa com os dados inseridos
        Pessoa pessoa = new Pessoa(nome, idade, altura, peso);

        // Calculando e exibindo o IMC
        double imc = IMCCalculadora.calcularIMC(pessoa);
        String classificacao = IMCCalculadora.classificarIMC(imc);

        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura() + " metros");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();

        String json = String.format(
                "{\n" +
                        "  \"nome\": \"%s\",\n" +
                        "  \"idade\": %d,\n" +
                        "  \"altura\": %.2f,\n" +
                        "  \"peso\": %d,\n" +
                        "  \"imc\": %.2f,\n" +
                        "  \"classificacao\": \"%s\"\n" +
                        "}",
                pessoa.getNome(),
                pessoa.getIdade(),
                pessoa.getAltura(),
                pessoa.getPeso(),
                imc,
                classificacao);

        try (FileWriter writer = new FileWriter("dados_imc.json", true)) {
            writer.write(json + "\n");
            System.out.println("Dados salvos em 'dados_imc.json'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o JSON: " + e.getMessage());
        }
    }
}
