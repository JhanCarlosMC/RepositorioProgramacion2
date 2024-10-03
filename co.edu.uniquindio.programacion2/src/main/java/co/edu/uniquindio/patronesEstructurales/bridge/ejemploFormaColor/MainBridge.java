package co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor;

import co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.abstraccion.Circle;
import co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.abstraccion.Shape;
import co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.abstraccion.Square;
import co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.implementacion.BlueColor;
import co.edu.uniquindio.patronesEstructurales.bridge.ejemploFormaColor.implementacion.RedColor;

//Separa la abstracción de la implementación para permitir que evolucionen independientemente.
public class MainBridge {

//    Shape y Color están desacoplados.
//    Shape representa la abstracción
//    y Color la implementación. La implementación de los colores
//    puede cambiar independientemente de las formas.
    public static void main(String[] args) {
        Shape circle = new Circle(new RedColor());
        System.out.println(circle.draw());

        Shape square = new Square(new BlueColor());
        System.out.println(square.draw());
    }
}
