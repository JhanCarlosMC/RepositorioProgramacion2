package co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.abstraccion;

import co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.implementacion.IColor;

// Implementación de la abstracción con el puente
public class Circle extends Shape {
    public Circle(IColor color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Circle drawn with color " + color.applyColor();
    }
}
