package ControleFluxo;

import java.util.Scanner;

public class IFELSE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // IF-ELSE
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        scanner.close();
    }
}
