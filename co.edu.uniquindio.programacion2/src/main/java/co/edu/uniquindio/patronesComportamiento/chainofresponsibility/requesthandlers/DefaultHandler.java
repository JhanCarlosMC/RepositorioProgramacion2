package co.edu.uniquindio.patronesComportamiento.chainofresponsibility.requesthandlers;

public class DefaultHandler extends RequestHandler {
  @Override
  public void handleRequest(String request) {
    System.out.println("DefaultHandler: Cannot process the request: " + request);
  }
}
