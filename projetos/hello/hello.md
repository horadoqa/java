# HELLO !!!

Para criar e executar o seu código Java, siga esses passos. Vou te guiar pelo processo completo, desde a criação do arquivo até a execução:

### Passo 1: Criar o Arquivo Java

1. **Abra um editor de texto** (como o Notepad no Windows, TextEdit no macOS ou qualquer editor de sua preferência).
   
2. **Crie um novo arquivo** com o nome `HelloWorld.java` (o nome do arquivo deve ser o mesmo que o nome da classe pública).

3. **Escreva o código Java** que você já tem:

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

4. **Salve o arquivo** com a extensão `.java` (certifique-se de que o arquivo seja salvo como `HelloWorld.java` e não como `HelloWorld.txt`).

### Passo 2: Compilar o Arquivo Java

1. **Abra o terminal ou prompt de comando** no seu sistema operacional.

   - **No Windows**: Abra o Prompt de Comando (digite `cmd` na barra de pesquisa do menu Iniciar).
   - **No macOS ou Linux**: Abra o Terminal.

2. **Navegue até o diretório onde o arquivo `HelloWorld.java` está salvo**. Use o comando `cd` para navegar. Por exemplo:
   - Se o arquivo está em `C:\MeusProjetos\Java`, você deve digitar:
     ```bash
     cd C:\MeusProjetos\Java
     ```

3. **Compile o código Java** usando o comando `javac` (o compilador Java). No terminal, digite:
   ```bash
   javac HelloWorld.java
   ```
   Se o código não contiver erros, isso criará um arquivo chamado `HelloWorld.class` no mesmo diretório, que é o bytecode compilado.

### Passo 3: Executar o Programa Java

1. Para **executar o programa** que você acabou de compilar, use o comando `java` seguido do nome da classe (sem a extensão `.class`). No terminal, digite:
   ```bash
   java HelloWorld
   ```
   
2. **Saída esperada**:
   O terminal deve exibir:
   ```bash
   Olá, Mundo!
   ```

### Resumo dos Comandos:

- **Compilar**: `javac HelloWorld.java`
- **Executar**: `java HelloWorld`

### Dicas Adicionais:

- Se você receber erros durante a compilação, leia as mensagens de erro cuidadosamente. Elas geralmente indicam o que precisa ser corrigido no código.
- Certifique-se de ter o **JDK instalado** corretamente e que o caminho do JDK esteja configurado nas variáveis de ambiente do sistema (se necessário).

Agora, você já sabe como criar, compilar e executar um programa simples em Java!