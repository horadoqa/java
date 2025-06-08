# Módulos

Dividir um código em módulos (classes separadas) melhora a organização, a reutilização e a manutenção do código. Isso é uma boa prática na programação orientada a objetos, especialmente em Java.

✅ 1. Estrutura dos arquivos
Supondo que você tenha os três arquivos na pasta ModulosIMC:

```bash
ModulosIMC/csv
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
javac ModulosIMC/csv/*.java
```
✅ 3. Executando o programa
Depois da compilação, execute a classe que contém o método main:

```bash
java ModulosIMC.csv.CalculaIMC
```