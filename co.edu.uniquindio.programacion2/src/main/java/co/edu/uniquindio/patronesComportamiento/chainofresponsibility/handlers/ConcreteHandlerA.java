package co.edu.uniquindio.patronesComportamiento.chainofresponsibility.handlers;

public class ConcreteHandlerA extends Handler {

  @Override
  public void handleRequest(String request) {
    if (request.equals("A")) {
      System.out.println("Responsabilidad dada a ConcreteHandlerA");

    } else if (this.getNext() != null) {
      this.getNext().handleRequest(request);
    }
  }

}
