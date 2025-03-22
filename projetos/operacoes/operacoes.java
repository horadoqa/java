package operacoes;
public class operacoes {
    public static void main(String[] args) {
        // Declaração e inicialização de variáveis
        String nome = "Operações Matemáticas";
        
        int numero1 = 100;
        int numero2 = 50;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;
        int resto = numero1 % numero2;
        
        // Usando as variáveis em uma mensagem
        System.out.println(nome);
        System.out.println("A soma dos números: " + soma);
        System.out.println("A subtração dos números: " + subtracao);
        System.out.println("A multiplicação dos números: " + multiplicacao);
        System.out.println("A divisão dos números: " + divisao);
        System.out.println("O resto da divisão dos números: " + resto);

    }
}
