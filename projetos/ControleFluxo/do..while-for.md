# DO X FOR

As palavras-chave `do` e `for` são usadas em várias linguagens de programação para criar **laços de repetição (loops)**, mas elas têm diferenças importantes em como e quando o código dentro do laço é executado.

---

## 🔁 Diferença entre `do` e `for`

### `do` (normalmente usado como `do...while`)

* **Sintaxe comum (exemplo em C/C++/Java):**

  ```c
  do {
      // código a ser executado
  } while (condição);
  ```

* **Características:**

  * **Executa o bloco de código pelo menos uma vez**, mesmo que a condição seja falsa na primeira verificação.
  * A **condição é avaliada no final** do loop.

* ✅ **Quando usar:**

  * Quando você **quer garantir que o código execute pelo menos uma vez**, independentemente da condição.

* **Exemplo:**

  ```c
  int x = 0;
  do {
      printf("%d\n", x);
      x++;
  } while (x < 3);
  ```

---

### `for`

* **Sintaxe comum (C/C++/Java):**

  ```c
  for (inicialização; condição; incremento) {
      // código a ser executado
  }
  ```

* **Características:**

  * Usado quando **sabemos previamente quantas vezes** o loop precisa ser executado.
  * **Tudo é controlado em uma linha**: início, condição de parada, e incremento.
  * A **condição é avaliada antes** de cada execução do bloco.

* ✅ **Quando usar:**

  * Quando você tem um **número conhecido de repetições** ou precisa de controle mais preciso do índice de repetição.

* **Exemplo:**

  ```c
  for (int i = 0; i < 3; i++) {
      printf("%d\n", i);
  }
  ```

---

## 🧠 Resumo prático:

| Característica           | `do...while`                         | `for`                         |
| ------------------------ | ------------------------------------ | ----------------------------- |
| Verificação da condição  | Depois do bloco                      | Antes do bloco                |
| Executa pelo menos 1 vez | Sim                                  | Não (se a condição for falsa) |
| Uso comum                | Loops com execução inicial garantida | Loops com contador definido   |