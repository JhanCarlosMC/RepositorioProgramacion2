package co.edu.uniquindio.patronesComportamiento.chainofresponsibility.requesthandlers;

// Manejador concreto para solicitudes de tipo "AUTH"
public class AuthHandler extends RequestHandler {
  @Override
  public void handleRequest(String request) {
    if (request.equals("AUTH")) {
      System.out.println("AuthHandler: Processing authentication request");
    } else if (nextHandler != null) {
      nextHandler.handleRequest(request);
    }
  }
}
