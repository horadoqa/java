package EntradaDeDados;
import java.util.Scanner; // Importando a classe Scanner

public class EntradaDeDados {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibindo uma mensagem para o usuário
        System.out.print("Insira um número: ");

        // Lendo o número inteiro digitado pelo usuário
        int numero = scanner.nextInt();

        // Exibindo o número que o usuário inseriu
        System.out.println("Você inseriu o número: " + numero);

        // Fechando o scanner (boa prática)
        scanner.close();
    }
}
