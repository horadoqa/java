package Calculadora;

import java.util.Scanner; // Importando a classe Scanner para entrada de dados

public class Calculadora {
    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibindo as opções de operação para o usuário
        System.out.println("Escolha a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        // Lendo a escolha do usuário
        int escolha = scanner.nextInt();

        // Solicitando os números para realizar a operação
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Variável para armazenar o resultado da operação
        double resultado;

        // Realizando a operação com base na escolha do usuário
        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                // Verificando se o segundo número é zero para evitar divisão por zero
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não permitida!");
                }
                break;
            default:
                System.out.println("Operação inválida! Por favor, escolha uma operação válida.");
                break;
        }

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}
