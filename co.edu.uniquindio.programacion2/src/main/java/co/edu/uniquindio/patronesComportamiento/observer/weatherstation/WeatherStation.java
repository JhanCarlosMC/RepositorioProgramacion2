package co.edu.uniquindio.patronesComportamiento.observer.weatherstation;

import java.util.ArrayList;
import java.util.List;

// Sujeto (Subject)
public class WeatherStation {
  private List<Observer> observers = new ArrayList<>();
  private String weatherUpdate;

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(weatherUpdate);
    }
  }

  public void setWeatherUpdate(String weatherUpdate) {
    this.weatherUpdate = weatherUpdate;
    notifyObservers();
  }
}
