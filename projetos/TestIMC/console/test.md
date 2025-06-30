# Executando testes no projeto

Neste guia, você aprenderá a executar testes usando a biblioteca **JUnit** em um projeto Java organizado.

---

## 1. Organização do projeto

É importante que o código esteja organizado em módulos (classes separadas), pois isso melhora a organização, reutilização e manutenção do código — uma boa prática essencial em programação orientada a objetos, especialmente em Java.

### Estrutura de arquivos exemplo:

Suponha que você tenha o seguinte conteúdo na pasta `TestIMC`:

```bash
.
├── console
│   ├── CalculaIMC.java
│   ├── IMCCalculadora.java
│   ├── Pessoa.java
│   └── test.md
├── images
│   └── test-junit.png
├── lib
│   └── junit-platform-console-standalone-1.13.1.jar
├── out
│   └── Test
│       ├── console
│       │   ├── CalculaIMC.class
│       │   ├── IMCCalculadora.class
│       │   └── Pessoa.class
│       └── test
│           └── CalculaIMCTest.class
├── run-tests.sh
└── test
    └── CalculaIMCTest.java

8 directories, 12 files
```

### Principais arquivos/classes

1. **Classe `Pessoa`**
   Responsável por armazenar os dados do usuário.

2. **Classe `IMCCalculadora`**
   Responsável por calcular o IMC e classificar o resultado.

3. **Classe `CalculaIMC` (classe principal)**
   Responsável por executar o programa.

4. **Classe `CalculaIMCTest`**
   Contém os testes unitários para as funcionalidades do projeto.

---

## 2. Preparação do ambiente

Se você ainda não tem, baixe o JUnit 5 (arquivo `junit-platform-console-standalone-x.y.z.jar`) do site oficial:

[https://search.maven.org/artifact/org.junit.platform/junit-platform-console-standalone](https://search.maven.org/artifact/org.junit.platform/junit-platform-console-standalone)

Link direto para a versão usada neste projeto:

```
https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.13.1/junit-platform-console-standalone-1.13.1.jar
```

Coloque o `.jar` dentro da pasta `lib` do seu projeto.

---

## 3. Configuração do VSCode para reconhecer o JUnit

Para que o VSCode reconheça o JUnit no editor (autocomplete, verificação de erros etc.), adicione no arquivo `.vscode/settings.json` do seu projeto a referência ao JAR do JUnit:

```json
{
  "java.project.referencedLibraries": [
    "projetos/ModulosIMC/gson/lib/gson-2.10.1.jar",
    "projetos/ModulosIMC/Test/lib/junit-platform-console-standalone-1.13.1.jar"
  ]
}
```

**Atenção:** Ajuste os caminhos conforme a estrutura e o local do seu projeto.

---

## 4. Reinicie o VSCode

Após salvar as alterações no `settings.json`, reinicie o VSCode ou use o comando da paleta:

```
Ctrl+Shift+P → Reload Window
```

Isso fará o VSCode recarregar o projeto e reconhecer as bibliotecas corretamente.

---

## 5. Compilar os arquivos

Abra o terminal na pasta que contém a pasta `ModulosIMC` e execute:

### Compilar os arquivos de produção (console):

```bash
javac -d TestIMC/out -cp Test/lib/junit-platform-console-standalone-1.13.1.jar TestIMC/console/*.java
```

### Compilar os arquivos de teste:

```bash
javac -d TestIMC/out -cp "TestIMC/lib/junit-platform-console-standalone-1.13.1.jar:TestIMC/out" TestIMC/test/*.java
```

---

## 6. Executar os testes

Após compilar, execute os testes com o comando:

```bash
java -jar TestIMC/lib/junit-platform-console-standalone-1.13.1.jar execute --class-path TestIMC/out --scan-class-pat
```

---

### 7. Saída esperada

Você deverá ver algo parecido com:

```bash
 Thanks for using JUnit! Support its development at https://junit.org/sponsoring

╷
├─ JUnit Platform Suite ✔
├─ JUnit Jupiter ✔
│  └─ CalculaIMCTest ✔
│     ├─ testCalculoIMC() ✔
│     ├─ testClassificacaoAbaixoPeso() ✔
│     ├─ testClassificacaoSobrepeso() ✔
│     ├─ testClassificacaoObesidade() ✔
│     └─ testClassificacaoPesoNormal() ✔
└─ JUnit Vintage ✔

Test run finished after 86 ms
[         4 containers found      ]
[         0 containers skipped    ]
[         4 containers started    ]
[         0 containers aborted    ]
[         4 containers successful ]
[         0 containers failed     ]
[         5 tests found           ]
[         0 tests skipped         ]
[         5 tests started         ]
[         0 tests aborted         ]
[         5 tests successful      ]
[         0 tests failed          ]

```

### 8. Entendendo os resultados

```bash
Test run finished after 86 ms
```

Os testes foram executados em 86 milissegundos — ou seja, foi um teste muito rápido.

--- 

📦 Containers

```bash
[         4 containers found      ]
[         0 containers skipped    ]
[         4 containers started    ]
[         0 containers aborted    ]
[         4 containers successful ]
[         0 containers failed     ]
```

Containers em JUnit 5 são estruturas de agrupamento de testes. Geralmente, correspondem a classes de teste ou grupos de métodos anotados.

- 4 containers encontrados = provavelmente 1 classe de teste com algumas anotações internas, ou outros elementos que JUnit considera containers.
- Todos foram iniciados e executados com sucesso.
- Nenhum container foi abortado ou falhou.

--- 

🧪 Testes individuais


```bash
[         5 tests found           ]
[         0 tests skipped         ]
[         5 tests started         ]
[         0 tests aborted         ]
[         5 tests successful      ]
[         0 tests failed          ]
```

- Foram detectados 5 testes (exatamente os 5 métodos da sua classe CalculaIMCTest).
- Todos foram executados e passaram (nenhum foi ignorado, abortado ou falhou).

---

✅ Resumo geral

✔️ Todos os testes passaram com sucesso.

❌ Nenhum erro ou falha foi encontrado.

🟢 Seu código está correto e funcionando conforme esperado, de acordo com os testes definidos.

---

Bons testes com Junit!!!
