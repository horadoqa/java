# POO

Para criar um programa utilizando Programação Orientada a Objetos (POO) com exemplo de carros, podemos definir uma classe `Carro` que terá algumas propriedades como modelo, cor, ano e um método para exibir essas informações.

Vamos seguir o seguinte processo:

1. Criar uma classe `Carro` com atributos (modelo, cor, ano) e métodos (como exibir informações).
2. Criar outra classe `Main` que será responsável por instanciar objetos da classe `Carro` e interagir com eles.

### Exemplo de Código:

#### 1. Classe `Carro.java`

```java
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
```

#### 2. Classe `Main.java` (para testar o exemplo)

```java
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
```

### Explicação:

1. **Classe `Carro`**:
   - **Atributos**: `modelo`, `cor` e `ano`, que são as características do carro.
   - **Construtor**: A classe tem um construtor que inicializa os atributos.
   - **Métodos**:
     - `exibirInformacoes()`: Exibe os dados do carro.
     - `ligar()` e `desligar()`: Simulam o comportamento de ligar e desligar o carro.
   - **Getters**: Métodos para acessar os valores dos atributos.

2. **Classe `Main`**:
   - Cria dois objetos da classe `Carro` (`carro1` e `carro2`), cada um com características diferentes.
   - Chama os métodos `exibirInformacoes()`, `ligar()` e `desligar()` para mostrar as informações e interagir com os carros.

### Saída do programa:

```
Informações do Carro 1:
Modelo: Fusca
Cor: Azul
Ano: 1980

Informações do Carro 2:
Modelo: Civic
Cor: Preto
Ano: 2020

O carro Fusca está ligado.
O carro Fusca está desligado.

O carro Civic está ligado.
O carro Civic está desligado.
```

### Como funciona a Programação Orientada a Objetos (POO) neste exemplo:
- **Encapsulamento**: Os dados do carro (como modelo, cor e ano) estão protegidos dentro da classe `Carro`. O acesso a esses dados é feito através de métodos (getters e setters).
- **Objetos**: Criamos instâncias (objetos) da classe `Carro`, o que representa carros específicos no mundo real.
- **Métodos**: A classe `Carro` tem comportamentos definidos, como `ligar`, `desligar` e `exibirInformacoes`.
- **Construtor**: A classe `Carro` tem um construtor que permite inicializar os valores dos atributos quando o objeto é criado.

### Testando o Código:

1. **Compilação**: Compile os arquivos utilizando o comando:
   ```bash
   javac Carro.java Main.java
   ```

2. **Execução**: Execute o código com o comando:
   ```bash
   java Main
   ```

Isso deve exibir as informações sobre os carros e suas interações, como ligar e desligar.

### Conclusão:
Este exemplo é uma implementação simples de um sistema de carros usando conceitos de POO. Podemos expandir esse programa para incluir outros atributos, como velocidade, modelo do motor, ou até mesmo incluir métodos para acelerar ou frear o carro, criando um sistema mais robusto e completo.