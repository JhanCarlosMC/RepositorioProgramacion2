package co.edu.uniquindio.patronesEstructurales.flyweight.ejemploCaracter;

// Uso del patrón Flyweight - Optimiza el uso de memoria compartiendo instancias de objetos similares.
public class MainFlyweight {

    public static void main(String[] args) {
        CaracterFactory fabrica = new CaracterFactory();

        Caracter a1 = fabrica.obtenerCaracter('A');
        Caracter a2 = fabrica.obtenerCaracter('A');
        Caracter b1 = fabrica.obtenerCaracter('B');

        a1.mostrar(12);
        a2.mostrar(14);  // Reutiliza el mismo objeto 'A'
        b1.mostrar(16);
    }
}
