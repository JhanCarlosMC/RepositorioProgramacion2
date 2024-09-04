package co.edu.uniquindio.patronesCreacionales.prototype.ejemploFiguras.model;

import co.edu.uniquindio.patronesCreacionales.prototype.ejemploFiguras.services.IPrototype;

/**
 * Clase que representa un Círculo y que implementa el patrón Prototype.
 * Esta clase permite crear copias (clones) de sus instancias.
 */
public class Circulo implements IPrototype {

    private int radio;
    private String color;

    public Circulo(int radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    @Override
    public IPrototype clone() {
        Circulo circulo = null;

        try {
            circulo = (Circulo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        return circulo;
    }

    @Override
    public String toString() {
        return "Círculo [radio=" + radio + ", color=" + color + "]";
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
