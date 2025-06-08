# Módulos

Dividir um código em módulos (classes separadas) melhora a organização, a reutilização e a manutenção do código. Isso é uma boa prática na programação orientada a objetos, especialmente em Java.

✅ 1. Estrutura dos arquivos
Supondo que você tenha os três arquivos na pasta ModulosIMC:

```bash
ModulosIMC/
├── CalculaIMC.java
├── Pessoa.java
└── IMCCalculadora.java
```

1. Classe `Pessoa`
Responsável por armazenar os dados do usuário.

2. Classe `IMCCalculadora`
Responsável por calcular o IMC e classificar o resultado

3. Classe `CalculaIMC` (classe principal)
Responsável apenas por executar o programa.

✅ 2. Compilando os arquivos
Abra o terminal, vá até o diretório que contém a pasta ModulosIMC, e digite:

```bash
javac ModulosIMC/*.java
```
✅ 3. Executando o programa
Depois da compilação, execute a classe que contém o método main:

```bash
java ModulosIMC.CalculaIMC
```

CSV

java ModulosIMC.CalculaIMCCSV

JSON

## Adicionar a Bibioteca `Gson`

Você tem **duas opções** para instalar o Gson, dependendo de como você está desenvolvendo:

---

## ✅ Opção 1: Instalar manualmente (sem Maven ou Gradle)

Se você está usando um editor simples (como VS Code, Notepad++, ou linha de comando):

### Passos:

1. **Baixe o JAR do Gson:**

   Link direto para download:
   👉 [https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar)

2. **Coloque o arquivo `gson-2.10.1.jar`** na mesma pasta do seu projeto, ou em uma pasta separada, como `lib/`.

3. **Compile com o JAR no classpath:**

   Supondo que os arquivos `.java` estejam na pasta `ModulosIMC` e o JAR esteja em uma pasta `lib/`:

   ```bash
   javac -cp ".:ModulosIMC/gson/lib/gson-2.10.1.jar" ModulosIMC/gson/*.java ModulosIMC/gson/console/*.java
   ```

4. **Execute o programa com o classpath:**

   ```bash
   java -cp ".:ModulosIMC/gson/lib/gson-2.10.1.jar" ModulosIMC.gson.CalculaIMC
   ```

   > ⚠️ No Windows, use `;` em vez de `:` no classpath:

   ```bash
   java -cp .;lib/gson-2.10.1.jar ModulosIMC.CalculaIMCJSON
   ```

## Para remover a mensagem de falso positivo do import

import com.google.

Como criar ou editar o settings.json do projeto no VSCode:
Dentro da raiz do seu projeto, crie a pasta .vscode (se ainda não existir).

Dentro da pasta .vscode, crie (ou edite) o arquivo settings.json.

Coloque nele a configuração, por exemplo:

```json
{
  "java.project.referencedLibraries": [
    "ModulosIMC/gson/lib/gson-2.10.1.jar"
  ]
}
```

Pressione `Ctrl+Shift+P` (Cmd+Shift+P no Mac), digite “Java: Clean Java Language Server Workspace” e execute.

Depois recarregue a janela do VSCode (`Ctrl+Shift+P` → “Reload Window”).