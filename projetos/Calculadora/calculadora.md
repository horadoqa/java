# CALCULADORA

Criar uma calculadora simples em Java é um excelente projeto para aprender a manipular entradas do usuário, estruturas de controle e operações aritméticas. Vou te guiar para criar uma calculadora que consiga realizar as operações básicas como **soma, subtração, multiplicação e divisão**.

### Passo 1: Estrutura Básica

Vamos criar uma calculadora simples que permite ao usuário escolher uma operação e inserir dois números para que a operação seja realizada.

Aqui está um exemplo completo de código para a calculadora:

```java
import java.util.Scanner; // Importando a classe Scanner para entrada de dados

public class Calculadora {
    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibindo as opções de operação para o usuário
        System.out.println("Escolha a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        // Lendo a escolha do usuário
        int escolha = scanner.nextInt();

        // Solicitando os números para realizar a operação
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Variável para armazenar o resultado da operação
        double resultado;

        // Realizando a operação com base na escolha do usuário
        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                // Verificando se o segundo número é zero para evitar divisão por zero
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não permitida!");
                }
                break;
            default:
                System.out.println("Operação inválida! Por favor, escolha uma operação válida.");
                break;
        }

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}
```

### Explicação do Código:

1. **Importação do Scanner**:
   - `import java.util.Scanner;`: Usamos a classe `Scanner` para permitir que o usuário insira dados no console.

2. **Entrada de Dados**:
   - O programa exibe as opções de operação (`soma`, `subtração`, `multiplicação`, `divisão`).
   - Em seguida, o programa solicita ao usuário para inserir dois números (do tipo `double` para permitir operações com números decimais).

3. **Escolha da Operação**:
   - O programa usa um `switch` para verificar a escolha do usuário (1 para soma, 2 para subtração, etc.).
   - Dependendo da escolha, o programa executa a operação correspondente e exibe o resultado.

4. **Verificação de Divisão por Zero**:
   - Caso o usuário escolha a operação de divisão, o programa verifica se o segundo número é zero. Se for, exibe uma mensagem de erro, já que não podemos dividir por zero.

5. **Fechando o Scanner**:
   - Após usar o `Scanner`, é uma boa prática fechá-lo com `scanner.close();` para liberar recursos do sistema.

---

### Passo 2: Testando o Programa

Quando você executar o programa, ele irá pedir ao usuário para escolher uma operação e inserir dois números. Exemplo de execução:

```
Escolha a operação:
1. Soma
2. Subtração
3. Multiplicação
4. Divisão
1
Digite o primeiro número: 5
Digite o segundo número: 3
Resultado: 8.0
```

Ou, se o usuário escolher a divisão e tentar dividir por zero:

```
Escolha a operação:
1. Soma
2. Subtração
3. Multiplicação
4. Divisão
4
Digite o primeiro número: 10
Digite o segundo número: 0
Erro: Divisão por zero não permitida!
```

---

### Passo 3: Melhorias

Aqui estão algumas melhorias que você pode adicionar à calculadora:

1. **Repetir a operação**: Permitir que o usuário realize várias operações sem precisar reiniciar o programa.
2. **Menu mais amigável**: Adicionar um loop para exibir o menu de operações novamente após cada operação.
3. **Validação de entrada**: Melhorar o tratamento de entradas inválidas (por exemplo, se o usuário digitar algo que não seja um número).
4. **Mais operações**: Adicionar operações como exponenciação, raiz quadrada, ou outros cálculos.
