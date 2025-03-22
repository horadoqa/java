package Exercito;
import java.util.Scanner; // Importando a classe Scanner

public class Exercito {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo para o usuário inserir a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê a idade inserida pelo usuário

        // Verificando se a idade é maior ou igual a 18
        if (idade >= 18) {
            System.out.println("Você tem idade suficiente para servir ao exército.");
        } else {
            System.out.println("Você não tem idade suficiente para servir ao exército.");
        }

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}
