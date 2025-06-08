package ControleFluxo;

import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SWITCH
        System.out.print("Digite um número de 1 a 3: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a opção 1.");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2.");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
