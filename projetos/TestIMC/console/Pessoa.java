// Essa parte do código Java define uma classe chamada Pessoa, 
// que serve para modelar uma pessoa com algumas características básicas.

package TestIMC.console;

public class Pessoa {

    // Modelar uma pessoa com os seguintes atributos privados
    private String nome;
    private int idade;
    private double altura;
    private int peso;

    // Construtor
    public Pessoa(String nome, int idade, double altura, int peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters (métodos de acesso)
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getAltura() { return altura; }
    public int getPeso() { return peso; }
}
