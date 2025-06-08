package imc;

public class CalculaIMC {
    public static void main(String[] args) {

        // Declaração e inicialização de variáveis
        String nome = "Ricardo Fahham";
        int idade = 54;
        double altura = 1.87;
        int peso = 55;

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Usando as variáveis em uma mensagem
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.printf("IMC: %.2f\n", imc);

        // Classificação do IMC
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
    }
}
