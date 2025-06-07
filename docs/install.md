# Instale o JDK (Java Development Kit)

Aqui está um passo a passo para começar:

## 1. **Instalsção do JDK (Java Development Kit)**

Para programar em Java, você precisa do **JDK**. Ele inclui a Java Runtime Environment (JRE) e ferramentas de desenvolvimento, como o compilador `javac` para compilar seu código Java.

- Vá para o [site oficial do JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) e faça o download.
- Siga as instruções de instalação para o seu sistema operacional.

### Verifique a versão do JDK instalado

```bash
java -version
openjdk version "11.0.27" 2025-04-15
OpenJDK Runtime Environment (build 11.0.27+6-post-Ubuntu-0ubuntu122.04)
OpenJDK 64-Bit Server VM (build 11.0.27+6-post-Ubuntu-0ubuntu122.04, mixed mode, sharing)
```

### Verificar a versão do Compilador

```bash
javac -version
javac 11.0.27
```

## 2. **Escolha um Editor de Código ou IDE**
Embora você possa escrever e compilar código Java em qualquer editor de texto, o recomendado é usar uma **IDE** (Integrated Development Environment), que facilita a escrita do código e fornece recursos como autocompletar e depuração.

Algumas IDEs populares para Java são:
- **[IntelliJ IDEA](https://www.jetbrains.com/)** (muito recomendado, especialmente para iniciantes)
- **[Eclipse](https://www.eclipse.org/downloads/)** (uma das mais usadas em empresas)
- **[NetBeans](https://netbeans.apache.org/front/main/index.html)** (outro ambiente bem popular)

## 3. **Aprenda a Sintaxe Básica**
Antes de mais nada, familiarize-se com a sintaxe básica da linguagem. Aqui estão alguns conceitos essenciais:
- **Variáveis e Tipos de Dados**: Como declarar variáveis e os tipos primitivos (int, double, boolean, etc.).
- **Controle de Fluxo**: Como usar estruturas de controle como `if`, `else`, `switch`, `while`, `for`.
- **Métodos**: Como criar métodos, passar parâmetros e retornar valores.
- **Classes e Objetos**: Java é uma linguagem orientada a objetos, então entender como criar classes e objetos é fundamental.

Exemplo simples de código:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
    }
}
```

## 4. **Recursos para Aprender Java**
Aqui estão alguns recursos recomendados para iniciantes:

### Livros:
- **"Head First Java"** – É uma leitura divertida e muito didática, focada no aprendizado de conceitos fundamentais de Java.
- **"Effective Java"** – Para quando você já tiver uma base e quiser aprender boas práticas e como melhorar seu código.

### Documentação:
- **[Documentação oficial do Java](https://docs.oracle.com/javase/8/docs/)**: A documentação da Oracle é muito rica e útil.

## 5. **Pratique Bastante**
A melhor maneira de aprender Java é praticando. Comece resolvendo pequenos problemas de programação em sites como:
- **[HackerRank](https://www.hackerrank.com/domains/tutorials/10-days-of-java)**: Tem desafios de programação em Java.
- **[LeetCode](https://leetcode.com/)**: Uma plataforma de desafios para melhorar suas habilidades de programação.
- **[Exercism.io](https://exercism.io/tracks/java)**: Oferece exercícios de Java com feedback da comunidade.

## 6. **Construa Projetos Simples**
Ao aprender a sintaxe e resolver exercícios, comece a construir projetos simples, como:
- **Calculadora**
- **Conversor de Temperatura**
- **Lista de Tarefas**
  
Isso vai ajudá-lo a aplicar o que aprendeu e ganhar experiência prática.

## 7. **Estude Conceitos Avançados**
À medida que você avança, comece a estudar tópicos mais complexos:
- **Coleções**: Listas, conjuntos, mapas, filas.
- **Exceções**: Como lidar com erros no seu código.
- **Programação Orientada a Objetos (POO)**: Herança, polimorfismo, encapsulamento e abstração.
- **Threads e Concurrency**: Para programar aplicações multi-thread.

## 8. **Participe de Comunidades**
Não hesite em procurar ajuda e aprender com outros programadores. Algumas boas comunidades para iniciantes incluem:
- **StackOverflow**: Uma comunidade global onde você pode tirar dúvidas.
- **Fóruns de Java no Reddit**: Como o r/learnjava.
- **Grupos no Discord ou Telegram**: Muitos grupos de programação oferecem suporte em tempo real.

---

Com essas etapas, você estará no caminho certo para se tornar um programador Java. 
Boa sorte, e não se esqueça de praticar constantemente!

📥 **Próximo passo**: [Entendendo sobre a estrutura do JAVA](./docs/estrutura.md)
