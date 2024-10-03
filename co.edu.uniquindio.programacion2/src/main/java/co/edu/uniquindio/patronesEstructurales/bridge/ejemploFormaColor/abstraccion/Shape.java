package co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.abstraccion;

import co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.implementacion.IColor;

// Abstracción
public abstract class Shape {
    protected IColor color;

    public Shape(IColor color) {
        this.color = color;
    }

    public abstract String draw();
}
