package co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.abstraccion;

import co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.implementacion.IColor;

public class Square extends Shape {
    public Square(IColor color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn with color " + color.applyColor();
    }
}
