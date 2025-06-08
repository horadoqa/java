package ModulosIMC.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import ModulosIMC.console.IMCCalculadora;
import ModulosIMC.console.Pessoa;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Paciente> pacientes = new ArrayList<>();

        // Tenta carregar pacientes existentes do JSON
        try (FileReader reader = new FileReader("dados_imc.json")) {
            Type listType = new TypeToken<List<Paciente>>() {}.getType();
            pacientes = new Gson().fromJson(reader, listType);
            if (pacientes == null) {
                pacientes = new ArrayList<>();
            }
        } catch (IOException e) {
            // Se o arquivo não existir ainda, segue com lista vazia
        }

        // Coleta os dados
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite sua altura (em metros): ");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite seu peso (em kg): ");
        int peso = Integer.parseInt(scanner.nextLine());

        Pessoa pessoa = new Pessoa(nome, idade, altura, peso);
        double imc = IMCCalculadora.calcularIMC(pessoa);
        String classificacao = IMCCalculadora.classificarIMC(imc);

        Paciente paciente = new Paciente(nome, idade, altura, peso, imc, classificacao);
        pacientes.add(paciente);

        // Salva a lista atualizada no JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("dados_imc.json")) {
            gson.toJson(pacientes, writer);
            System.out.println("Dados salvos corretamente no arquivo JSON como array.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o JSON: " + e.getMessage());
        }

        scanner.close();
    }
}
