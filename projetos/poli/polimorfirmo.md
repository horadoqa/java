package projetos.poli;
O que é Polimorfismo em Java?

Polimorfismo significa "muitas formas". Na prática, ele permite que objetos de classes diferentes respondam de maneira diferente ao mesmo método.

Isso torna seu código mais flexível, modular e fácil de manter, especialmente quando trabalhamos com herança e interfaces.


Tipos de Polimorfismo em Java:

1. Polimorfismo em tempo de compilação (também chamado de sobrecarga de método ou method overloading).

Ocorre quando uma mesma classe tem vários métodos com o mesmo nome, mas com parâmetros diferentes.


 Exemplo:

class Impressora {

 void imprimir(String texto) {
 System.out.println("Texto: " + texto);
 }

 void imprimir(int numero) {
 System.out.println("Número: " + numero);
 }

 void imprimir(String texto, int numero) {
 System.out.println("Texto e número: " + texto + ", " + numero);
 }
}

Explicação:
A classe Impressora tem vários métodos imprimir, mas cada um aceita parâmetros diferentes. O compilador decide qual versão chamar com base nos argumentos usados.


2. Polimorfismo em tempo de execução (também chamado de sobrescrita de método ou method overriding)
Ocorre quando uma subclasse reimplementa um método que ela herda da superclasse.

Exemplo:

class Notificador {
 void notificar() {
 System.out.println("Enviando notificação genérica...");
 }
}

class NotificadorEmail extends Notificador {
 @Override
 void notificar() {
 System.out.println("Enviando notificação por e-mail...");
 }
}

class NotificadorSMS extends Notificador {
 @Override
 void notificar() {
 System.out.println("Enviando notificação por SMS...");
 }
}

Uso prático:

public class Main {
 public static void main(String[] args) {
 Notificador n1 = new NotificadorEmail();
 Notificador n2 = new NotificadorSMS();

 n1.notificar(); // Enviando notificação por e-mail...
 n2.notificar(); // Enviando notificação por SMS...
 }
}


Explicação:
Mesmo que n1 e n2 sejam do tipo Notificador, o método chamado depende da classe real do objeto. Isso é polimorfismo dinâmico, decidido em tempo de execução.