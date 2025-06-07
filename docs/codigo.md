# Criando o Código em Java

Neste guia, vamos criar o nosso primeiro código Java. Vamos seguir um passo a passo para criar e compilar um programa simples que imprime a mensagem "Olá, Mundo!" no console.

## Passo 1: Criando o Arquivo `HelloWorld.java`

Primeiro, crie um arquivo chamado **`HelloWorld.java`** e adicione o seguinte código:

```java
// 1. Declaração do pacote (opcional, mas recomendada)
package hello; // Definindo o pacote 'hello' para a classe

// 2. Declaração da classe HelloWorld
public class HelloWorld {  // O nome da classe deve ser igual ao nome do arquivo (.java)

    // 3. Método principal (ponto de entrada do programa)
    public static void main(String[] args) {
        // 4. Exibindo uma mensagem no console
        System.out.println("Olá, Mundo!");  // Exibe a mensagem "Olá, Mundo!" no console
    }
}
```

### Explicação do Código:

1. **Pacote (Package)**:
   - A linha `package hello;` define o pacote em que a classe `HelloWorld` está contida. Isso ajuda a organizar o código, especialmente em projetos maiores.
   - O nome do pacote deve corresponder à estrutura de diretórios do projeto. Ou seja, o arquivo `HelloWorld.java` deve estar em uma pasta chamada `hello/`.

2. **Declaração da Classe**:
   - `public class HelloWorld {}`: Aqui, a classe `HelloWorld` é declarada como pública (`public`), o que significa que pode ser acessada fora do pacote onde foi definida. O nome da classe deve ser igual ao nome do arquivo Java (neste caso, `HelloWorld.java`).

3. **Método Principal (main)**:
   - O método `main` é o ponto de entrada do programa. É a primeira parte do código que é executada quando você roda o programa. Ele é obrigatório em programas Java que você deseja executar diretamente.
   - A assinatura do método `main` deve ser sempre a mesma: `public static void main(String[] args)`.
   - O código dentro de `main()` é o que será executado, no caso, imprime a mensagem "Olá, Mundo!" no console.

4. **Exibição de Mensagem**:
   - `System.out.println("Olá, Mundo!");`: Este comando imprime a mensagem "Olá, Mundo!" no console. O `println` garante que a mensagem será seguida por uma quebra de linha.

📥 **Próximo passo**:

Agora que você criou seu primeiro programa Java, você pode precisa compilar. Para aprender sobre a compilação em mais detalhes, confira a [documentação de compilação](compilacao.md).

