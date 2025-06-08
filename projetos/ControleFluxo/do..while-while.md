Ótima pergunta! As estruturas `do...while` e `while` são **ambas usadas para criar loops**, mas elas têm uma **diferença fundamental na ordem em que a condição é verificada**.

---

## 🔁 Diferença entre `do...while` e `while`

### 🔸 `while`

* **A condição é verificada ANTES** da execução do bloco.
* O código dentro do loop **pode nunca ser executado**, se a condição já for falsa na primeira verificação.

#### 📌 Exemplo:

```c
int x = 5;
while (x < 5) {
    printf("Dentro do while\n");
    x++;
}
```

* **Saída:** nada (condição falsa desde o início)

---

### 🔸 `do...while`

* **A condição é verificada DEPOIS** da execução do bloco.
* O código **sempre é executado pelo menos uma vez**, mesmo que a condição seja falsa.

#### 📌 Exemplo:

```c
int x = 5;
do {
    printf("Dentro do do...while\n");
    x++;
} while (x < 5);
```

* **Saída:**

  ```
  Dentro do do...while
  ```

---

## 🧠 Comparação direta:

| Característica             | `while`                                        | `do...while`                                   |
| -------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| Verifica condição antes?   | Sim                                            | Não                                            |
| Garante 1 execução mínima? | Não                                            | Sim                                            |
| Quando usar?               | Quando **talvez não precise** executar o bloco | Quando **precisa executar pelo menos uma vez** |

