package POO;

public class Carro {
    // Atributos
    private String modelo;
    private String cor;
    private int ano;

    // Construtor
    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    // Métodos para acessar os atributos (Getters)
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    // Método para ligar o carro
    public void ligar() {
        System.out.println("O carro " + modelo + " está ligado.");
    }

    // Método para desligar o carro
    public void desligar() {
        System.out.println("O carro " + modelo + " está desligado.");
    }
}
