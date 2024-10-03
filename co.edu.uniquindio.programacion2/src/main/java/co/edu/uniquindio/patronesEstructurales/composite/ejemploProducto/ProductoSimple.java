package co.edu.uniquindio.patronesEstructurales.composite.ejemploProducto;

// Objeto hoja
public class ProductoSimple implements IProducto {
    private String nombre;
    private double precio;

    public ProductoSimple(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public void mostrar() {
        System.out.println("Producto: " + nombre + " - Precio: " + precio);
    }
}