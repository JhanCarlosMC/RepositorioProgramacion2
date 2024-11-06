package co.edu.uniquindio.patronesComportamiento.chainofresponsibility.handlers;

public abstract class Handler {

  private Handler next;
  public void setNext(Handler next) {
    this.next = next;
  }
  public Handler getNext() {
    return next;
  }

  public abstract void handleRequest(String request);
}
