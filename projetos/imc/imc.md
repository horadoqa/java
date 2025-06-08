# O que caracteriza que um código é Monolítico, Linear e procedural ?

## ✅ **1. Código Monolítico**

Um sistema ou aplicação é **monolítico** quando **todo o código está agrupado em um único bloco**, sem divisões claras de responsabilidade, e todos os componentes estão interdependentes.

### 🔍 Características:

* **Uma única aplicação grande** (geralmente com um único ponto de entrada).
* **Todas as funcionalidades estão no mesmo projeto** (ou mesmo arquivo).
* **Pouca ou nenhuma separação de camadas** (como lógica de negócio, dados e interface).
* Dificuldade de **manutenção e teste isolado**.
* Exemplo: tudo dentro de um único `main()`.

---

## ✅ **2. Código Linear**

**Código linear** significa que **o fluxo de execução segue uma linha única e direta**, do topo até o final, sem loops complexos, chamadas entre módulos, ou ramificações estruturadas.

### 🔍 Características:

* Executa **de cima para baixo**.
* Poucas ou nenhuma **função, classe ou método reutilizável**.
* Difícil de reutilizar ou manter.
* Exemplo típico: scripts de configuração, pequenos programas de cálculo, scripts shell.

---

## ✅ **3. Código Procedural**

A **programação procedural** é um paradigma baseado em **procedimentos (funções)**, que operam sobre dados.

### 🔍 Características:

* Usa **funções** em vez de objetos.
* Separa a lógica em blocos reutilizáveis, mas **sem encapsular dados** com comportamentos.
* Não há orientação a objetos (sem classes/objetos interativos).
* Menos flexível para sistemas grandes.
* Exemplo clássico: C, scripts Python, ou Java sem classes além do `main()`.

---

## 🧠 Comparação resumida

| Tipo           | Característica principal    | Exemplo típico                             |
| -------------- | --------------------------- | ------------------------------------------ |
| **Monolítico** | Tudo junto, interdependente | Uma única aplicação `.jar` com tudo        |
| **Linear**     | Executa em sequência direta | Código do início ao fim, sem modularização |
| **Procedural** | Usa funções, não objetos    | Funções que operam em dados separados      |

---

## ✅ Como reconhecer os três juntos?

Seu código está assim se:

* Tudo está em um **único arquivo** (monolítico).
* O programa começa e termina em sequência **sem chamadas estruturadas** (linear).
* Usa apenas **variáveis e talvez funções simples**, sem objetos interativos (procedural).

---

### 🧭 Se quiser evoluir:

* Separe lógica em **classes/métodos** (orientação a objetos).
* Divida em **camadas** (ex: entrada, lógica, saída).
* Crie um projeto mais **modular e testável**.