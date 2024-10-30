package co.edu.uniquindio.patronesComportamiento.observer.newsagency;

// Implementación del Observador
public class NewsChannel implements Observer{
  private String name;

  public NewsChannel(String name) {
    this.name = name;
  }

  @Override
  public void update(String message) {
    System.out.println("Channel " + name + " received news: " + message);
  }
}
