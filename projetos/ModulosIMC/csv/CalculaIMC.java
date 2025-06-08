package ModulosIMC.csv;

import java.util.Scanner;

import ModulosIMC.console.IMCCalculadora;
import ModulosIMC.console.Pessoa;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

        try (PrintWriter writer = new PrintWriter(new FileWriter("dados_imc.csv", true))) {
            writer.printf("%s,%d,%.2f,%d,%.2f,%s%n",
                    pessoa.getNome(),
                    pessoa.getIdade(),
                    pessoa.getAltura(),
                    pessoa.getPeso(),
                    imc,
                    classificacao);
            System.out.println("Dados salvos em 'dados_imc.csv'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }
}
