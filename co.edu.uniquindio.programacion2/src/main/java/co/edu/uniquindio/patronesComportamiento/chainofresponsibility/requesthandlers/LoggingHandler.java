package co.edu.uniquindio.patronesComportamiento.chainofresponsibility.requesthandlers;

public class LoggingHandler extends RequestHandler {
  @Override
  public void handleRequest(String request) {
    if (request.equals("LOG")) {
      System.out.println("LoggingHandler: Processing logging request");
    } else if (nextHandler != null) {
      nextHandler.handleRequest(request);
    }
  }
}
