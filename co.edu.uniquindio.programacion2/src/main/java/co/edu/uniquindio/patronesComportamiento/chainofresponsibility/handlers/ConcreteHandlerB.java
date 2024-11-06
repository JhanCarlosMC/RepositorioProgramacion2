package co.edu.uniquindio.patronesComportamiento.chainofresponsibility.handlers;

public class ConcreteHandlerB extends Handler {

  @Override
  public void handleRequest(String request) {
    if (request.equals("B")) {
      System.out.println("Responsabilidad dada a ConcreteHandlerB");

    } else if (this.getNext() != null) {
      this.getNext().handleRequest(request);
    }
  }

}
