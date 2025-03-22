# Estruturas de Projeto em Java

## Estrutura Básica do Arquivo `.java`

Um arquivo `.java` contém o código fonte de uma classe. Abaixo está a estrutura básica de um arquivo `.java` com o exemplo de um simples "Olá, Mundo!".

### Exemplo de Arquivo `HelloWorld.java`

```java
// 1. Importação de pacotes (opcional)
import java.util.Scanner; // Importando a classe Scanner para captura de dados (não necessária neste exemplo)

// 2. Declaração da classe
public class HelloWorld {  // O nome da classe deve ser igual ao nome do arquivo (HelloWorld.java)

    // 3. Método principal (main)
    public static void main(String[] args) {
        // 4. Comando para exibir uma mensagem no console
        System.out.println("Olá, Mundo!"); // Exibe a mensagem "Olá, Mundo!" no console
    }
}
```

### Explicação do Código:

1. **Importação de Pacotes**:
   - `import java.util.Scanner;`: A linha de importação permite que você utilize a classe `Scanner` do pacote `java.util`, que serve para ler dados do usuário (não é necessário neste exemplo específico, mas é útil para programas interativos).
   
2. **Declaração da Classe**:
   - `public class HelloWorld {}`: Toda aplicação Java precisa de uma classe, e a classe é o recipiente onde o código é definido. O nome da classe deve ser o mesmo do arquivo `.java`. 
   - A palavra-chave `public` indica que a classe pode ser acessada de fora de seu pacote.

3. **Método Principal**:
   - `public static void main(String[] args) {}`: O método `main` é o ponto de entrada de qualquer aplicação Java. O código dentro desse método é executado quando o programa é iniciado.
   - A palavra-chave `public` permite o acesso ao método de fora da classe, `static` significa que o método pode ser chamado sem a necessidade de criar uma instância da classe, e `void` indica que o método não retorna valor. O parâmetro `String[] args` permite passar argumentos para o programa via linha de comando.

4. **Comando de Impressão**:
   - `System.out.println("Olá, Mundo!");`: Este comando exibe a mensagem "Olá, Mundo!" no console. `System.out` refere-se à saída padrão (geralmente o console), e `println` imprime a mensagem seguida de uma nova linha.

---

## Estrutura do Projeto Java

Abaixo está um exemplo de como um projeto Java pode ser organizado em um diretório. O código fonte de cada classe está dentro de pastas correspondentes ao seu pacote, e cada pasta contém os arquivos `.java` e `.class` gerados após a compilação.

### Exemplo de Estrutura de Diretórios:

```bash
projetos✗ tree
.
├── hello
│   ├── HelloWorld.class   # Arquivo compilado (bytecode) da classe HelloWorld
│   ├── HelloWorld.java    # Arquivo fonte (.java) da classe HelloWorld
│   └── hello.md           # Documentação adicional do projeto HelloWorld
└── variaveis
    ├── ExemploVariavel.class  # Arquivo compilado da classe ExemploVariavel
    ├── ExemploVariavel.java   # Arquivo fonte (.java) da classe ExemploVariavel
    └── variaveis.md           # Documentação adicional do projeto ExemploVariavel

2 directories, 6 files
```

### Explicação da Estrutura de Diretórios:

- **Pasta `hello`**:
  - Contém o código fonte e o bytecode da classe `HelloWorld`.
  - O arquivo `HelloWorld.java` contém o código fonte, e `HelloWorld.class` é o bytecode gerado após a compilação.
  - O arquivo `hello.md` pode conter informações ou a documentação do projeto específico.

- **Pasta `variaveis`**:
  - Contém o código fonte e o bytecode da classe `ExemploVariavel`.
  - Similar à pasta `hello`, contém o arquivo fonte `ExemploVariavel.java` e o arquivo compilado `ExemploVariavel.class`.
  - O arquivo `variaveis.md` também pode conter informações ou a documentação específica do projeto.

---

## Criando o Seu Primeiro Código em Java

Se você está começando com Java, pode começar com o projeto **HelloWorld**. Clique no link abaixo para saber mais sobre como criar e executar seu primeiro programa Java:

[Criando o seu primeiro código com Java: HelloWorld](./projetos/hello/hello.md)
