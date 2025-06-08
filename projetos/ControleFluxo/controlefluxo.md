# Controle de Fluxo

O **controle de fluxo** em uma linguagem de programação serve para **determinar a ordem em que as instruções (ou blocos de código) são executadas**.

### 🧠 Em outras palavras:

Ele permite que o programa **tome decisões**, **repita ações** ou **pule partes do código**, dependendo de condições ou lógica definidas pelo programador.

## 🚦 Tipos principais de controle de fluxo:

### 1. **Condicionais**

Permitem **executar um bloco de código somente se uma condição for verdadeira**.

#### Exemplo (`if`, `else if`, `else`):

Uma explicação objetiva sobre o **IF**, **ELSE IF** e **ELSE**:

* **IF**: É uma estrutura condicional usada para testar uma expressão lógica. Se essa expressão for verdadeira, o bloco de código associado ao IF será executado.

* **ELSE IF**: Vem logo após um IF (ou outro ELSE IF) e permite testar uma nova condição se as anteriores forem falsas. Pode haver quantos ELSE IF forem necessários, e eles são avaliados na ordem em que aparecem.

* **ELSE**: É a parte final da estrutura condicional. Ele captura todos os casos que não foram contemplados pelas condições anteriores (IF e ELSE IF). Não testa nenhuma condição, apenas executa um bloco de código quando todas as outras falham.

Em Java

```java
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
```

Em python

```python
if idade >= 18:
    print("Você é maior de idade.")
else:
    print("Você é menor de idade.")
```

Em Javascript

```javascript
if (idade >= 18) {
    console.log("Você é maior de idade.");
} else {
    console.log("Você é menor de idade.");
}
```

### 2. **Laços de repetição (loops)**

Permitem **executar um bloco de código várias vezes**, enquanto uma condição for verdadeira ou por um número determinado de vezes.

#### Exemplos:

Aqui estão **exemplos simples e bem explicados** de `while`, `do...while` e `for` em **Java**, para te ajudar a entender como cada um funciona:

---

## 🔁 Exemplo `while`

```java
public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 5) {
            System.out.println("while: contador = " + contador);
            contador++;
        }
    }
}
```

### 🔍 Explicação:

* O laço verifica a **condição antes de executar**.
* Só executa se `contador < 5` for **verdadeiro**.

---

## 🔁 Exemplo `do...while`

```java
public class ExemploDoWhile {
    public static void main(String[] args) {
        int contador = 0;

        do {
            System.out.println("do...while: contador = " + contador);
            contador++;
        } while (contador < 5);
    }
}
```

### 🔍 Explicação:

* O bloco é executado **primeiro**, e a condição é testada **depois**.
* **Sempre executa pelo menos uma vez**, mesmo que a condição seja falsa.

---

## 🔁 Exemplo `for`

```java
public class ExemploFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("for: i = " + i);
        }
    }
}
```

### 🔍 Explicação:

* O `for` é útil quando **sabemos quantas vezes o laço deve rodar**.
* Aqui, ele roda de `i = 0` até `i < 5`.

---

## 📌 Resumo rápido:

| Estrutura    | Verifica condição antes? | Executa ao menos 1 vez? | Uso típico                             |
| ------------ | ------------------------ | ----------------------- | -------------------------------------- |
| `while`      | Sim                      | Não                     | Laço com condição indefinida           |
| `do...while` | Não                      | Sim                     | Quando precisa executar ao menos 1 vez |
| `for`        | Sim                      | Não                     | Contador conhecido ou fixo             |

Se quiser exemplos mais práticos (como somar números, validar entrada do usuário, etc.), posso montar também!


### 3. **Desvios (jumps ou saltos)**

Alteram diretamente o fluxo de execução, **pulando ou interrompendo o código**.

#### Exemplos:

* `break` – sai de um loop
* `continue` – pula para a próxima iteração do loop
* `return` – sai de uma função
* `goto` – (pouco recomendado) vai para um rótulo específico

```c
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // sai do loop quando i for 5
    }
    printf("%d\n", i);
}
```

## 🎯 Por que é importante?

Sem controle de fluxo, um programa **executaria de cima para baixo**, linha por linha, sem tomar decisões, sem repetições, e sem flexibilidade.

### ✅ Com controle de fluxo, você pode:

* Criar **regras e condições** (ex: só deixar acessar se for autenticado)
* **Repetir tarefas automaticamente** (ex: processar todos os itens de uma lista)
* **Tratar exceções ou erros**
* Escrever **códigos mais inteligentes, reutilizáveis e interativos**