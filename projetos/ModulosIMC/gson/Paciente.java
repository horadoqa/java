package ModulosIMC.gson;

public class Paciente {
    private String nome;
    private int idade;
    private double altura;
    private int peso;
    private double imc;
    private String classificacao;

    public Paciente(String nome, int idade, double altura, int peso, double imc, String classificacao) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public double getImc() {
        return imc;
    }

    public String getClassificacao() {
        return classificacao;
    }
}
