package co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.abstraccion;

import co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.implementacion.Color;

// Abstracción
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract String draw();
}
