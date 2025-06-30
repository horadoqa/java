// Esse trecho de código Java define uma classe utilitária chamada IMCCalculadora, 
// que serve para calcular e classificar o IMC (Índice de Massa Corporal) de uma pessoa.

package TestIMC.console;

public class IMCCalculadora {
    
    // Método 1 - calcularIMC(Pessoa pessoa)
    public static double calcularIMC(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    // Método 2 - classificarIMC(double imc)
    public static String classificarIMC(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Peso normal";
        else if (imc < 30) return "Sobrepeso";
        else return "Obesidade";
    }
}
