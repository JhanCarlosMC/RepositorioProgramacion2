package co.edu.uniquindio.patronesComportamiento.chainofresponsibility.handlers;

public class MainChainOfResponsibility {

  public static void main(String[] args) {
    Handler handlerA = new ConcreteHandlerA();
    Handler handlerB = new ConcreteHandlerB();

    handlerA.setNext(handlerB);

    handlerA.handleRequest("B");
  }
}
