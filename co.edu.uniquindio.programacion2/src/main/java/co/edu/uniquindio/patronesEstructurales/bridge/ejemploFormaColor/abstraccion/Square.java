package co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.abstraccion;

import co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.implementacion.Color;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn with color " + color.applyColor();
    }
}
