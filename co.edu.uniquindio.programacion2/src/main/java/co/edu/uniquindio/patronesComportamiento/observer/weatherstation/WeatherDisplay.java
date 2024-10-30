package co.edu.uniquindio.patronesComportamiento.observer.weatherstation;

// Observador concreto
public class WeatherDisplay extends Observer {
  private String displayName;

  public WeatherDisplay(String displayName) {
    this.displayName = displayName;
  }

  @Override
  public void update(String message) {
    System.out.println(displayName + " displays weather: " + message);
  }
}
