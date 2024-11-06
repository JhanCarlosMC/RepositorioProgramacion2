package co.edu.uniquindio.patronesComportamiento.chainofresponsibility.requesthandlers;

public class MainChainOfResponsibility {
  public static void main(String[] args) {
    // Crear manejadores
    RequestHandler authHandler = new AuthHandler();
    RequestHandler loggingHandler = new LoggingHandler();
    RequestHandler defaultHandler = new DefaultHandler();

    // Configurar la cadena de responsabilidad
    authHandler.setNextHandler(loggingHandler);
    loggingHandler.setNextHandler(defaultHandler);

    // Probar las solicitudes
    authHandler.handleRequest("AUTH");
    authHandler.handleRequest("LOG");
    authHandler.handleRequest("UNKNOWN");
  }
}
