package POO;

public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro carro1 = new Carro("Fusca", "Azul", 1980);
        Carro carro2 = new Carro("Civic", "Preto", 2020);

        // Exibindo as informações dos carros
        System.out.println("Informações do Carro 1:");
        carro1.exibirInformacoes();
        System.out.println(); // Linha em branco
        System.out.println("Informações do Carro 2:");
        carro2.exibirInformacoes();
        System.out.println(); // Linha em branco

        // Usando métodos de ligar e desligar
        carro1.ligar();
        carro1.desligar();
        System.out.println();
        carro2.ligar();
        carro2.desligar();
    }
}
