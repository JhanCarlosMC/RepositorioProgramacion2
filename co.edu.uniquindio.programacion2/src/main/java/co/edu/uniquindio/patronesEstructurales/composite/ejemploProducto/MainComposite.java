package co.edu.uniquindio.patronesEstructurales.composite.ejemploProducto;

// Uso del patrón Composite - Permite tratar objetos individuales y compuestos de la misma manera.
public class MainComposite {

    public static void main(String[] args) {
        ProductoSimple producto1 = new ProductoSimple("Camisa", 20.0);
        ProductoSimple producto2 = new ProductoSimple("Pantalón", 40.0);

        Paquete paquete = new Paquete();
        paquete.agregarProducto(producto1);
        paquete.agregarProducto(producto2);

        paquete.mostrar();
        System.out.println("Precio total del paquete: " + paquete.obtenerPrecio());
    }

}
