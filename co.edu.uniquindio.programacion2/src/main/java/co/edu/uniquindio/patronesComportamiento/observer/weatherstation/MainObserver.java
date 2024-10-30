package co.edu.uniquindio.patronesComportamiento.observer.weatherstation;

// Clase principal para probar el patrón
public class MainObserver {
  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStation();

    WeatherDisplay display1 = new WeatherDisplay("Display 1");
    WeatherDisplay display2 = new WeatherDisplay("Display 2");

    weatherStation.registerObserver(display1);
    weatherStation.registerObserver(display2);

    weatherStation.setWeatherUpdate("Sunny, 25°C");
    weatherStation.setWeatherUpdate("Rainy, 18°C");
  }
}
