Em Java, a declaração e utilização de variáveis seguem uma estrutura simples. Aqui está uma explicação passo a passo de como declarar e usar variáveis em Java:

### 1. **Declaração de variáveis**

Em Java, para declarar uma variável, você deve informar o tipo de dado e o nome da variável. Aqui estão alguns exemplos de tipos básicos de variáveis em Java:

- **Tipos numéricos inteiros:** `int`, `long`, `short`, `byte`
- **Tipos numéricos de ponto flutuante:** `float`, `double`
- **Texto:** `String`
- **Valor booleano:** `boolean`
- **Caractere único:** `char`

#### Exemplos de declaração:

```java
// Declaração de variáveis
int idade;         // Variável inteira
double altura;     // Variável de ponto flutuante
boolean isAtivo;   // Variável booleana
String nome;      // Variável de texto (String)
char inicial;     // Variável de caractere
```

### 2. **Inicialização de variáveis**

Após declarar uma variável, você pode atribuir um valor a ela. Isso pode ser feito na declaração ou em uma linha separada.

#### Exemplo de inicialização:

```java
int idade = 25;           // Atribuindo um valor à variável
double altura = 1.75;     // Atribuindo valor a uma variável de ponto flutuante
boolean isAtivo = true;   // Atribuindo valor booleano
String nome = "João";     // Atribuindo valor a uma String
char inicial = 'J';       // Atribuindo valor a um caractere
```

### 3. **Usando variáveis**

Após declarar e inicializar as variáveis, você pode usá-las para realizar operações ou imprimir seus valores. Um exemplo simples de uso de variáveis pode ser:

```java
public class ExemploVariavel {
    public static void main(String[] args) {
        // Declaração e inicialização de variáveis
        int idade = 30;
        double altura = 1.80;
        String nome = "Maria";
        
        // Usando as variáveis em uma mensagem
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
    }
}
```

### 4. **Mudando os valores das variáveis**

Você pode alterar o valor de uma variável a qualquer momento no código, desde que a variável seja mutável (não seja uma constante final).

```java
public class AlterandoVariavel {
    public static void main(String[] args) {
        int idade = 30;
        idade = 35;  // Alterando o valor da variável

        System.out.println("Nova idade: " + idade);
    }
}
```

### 5. **Constantes**

Se você quiser criar uma variável cujo valor não pode ser alterado depois de definido, você pode usar a palavra-chave `final` para torná-la uma constante:

```java
public class Constante {
    public static void main(String[] args) {
        final double PI = 3.14159;  // Constante

        // PI = 3.14;  // Erro! Não é possível modificar uma constante

        System.out.println("Valor de PI: " + PI);
    }
}
```

### Resumo

- **Declaração:** Você declara uma variável especificando o tipo e o nome.
- **Inicialização:** Você atribui um valor à variável.
- **Uso:** Você pode usar as variáveis para fazer cálculos, imprimir valores ou em qualquer outro lugar dentro do seu código.
- **Alteração:** Você pode modificar o valor de variáveis, mas não de constantes (`final`).

Esses são os conceitos básicos de declaração e uso de variáveis em Java.