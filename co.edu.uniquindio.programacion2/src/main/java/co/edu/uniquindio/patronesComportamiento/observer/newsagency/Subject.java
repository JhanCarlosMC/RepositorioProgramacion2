package co.edu.uniquindio.patronesComportamiento.observer.newsagency;

// Sujeto (Subject)
public interface Subject {
  void registerObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}
