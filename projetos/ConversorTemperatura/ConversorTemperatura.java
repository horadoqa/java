package ConversorTemperatura;

import java.util.Scanner; // Importando a classe Scanner para capturar entradas do usuário

public class ConversorTemperatura {
    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibindo o menu para o usuário
        System.out.println("Escolha a opção de conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        
        // Lendo a escolha do usuário
        int opcao = scanner.nextInt();

        // Processando a escolha do usuário
        if (opcao == 1) {
            // Conversão de Celsius para Fahrenheit
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + "°C é igual a " + fahrenheit + "°F.");
        } else if (opcao == 2) {
            // Conversão de Fahrenheit para Celsius
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println(fahrenheit + "°F é igual a " + celsius + "°C.");
        } else {
            // Caso o usuário digite uma opção inválida
            System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
        }

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}
