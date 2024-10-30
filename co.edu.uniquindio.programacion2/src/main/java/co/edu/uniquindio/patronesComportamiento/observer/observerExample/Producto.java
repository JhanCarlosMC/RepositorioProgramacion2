package co.edu.uniquindio.patronesComportamiento.observer.observerExample;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private List<Observer> observers = new ArrayList<>();
    private int stock;

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    public void eliminarObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStock(int stock) {
        this.stock = stock;
        notificarObservers();
    }

    public int getStock() {
        return stock;
    }

    private void notificarObservers() {
        for (Observer observer : observers) {
            observer.actualizar(stock);
        }
    }
}