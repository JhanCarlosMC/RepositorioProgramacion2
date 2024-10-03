package co.edu.uniquindio.patronesEstructurales.composite.ejemploProducto;

import java.util.ArrayList;
import java.util.List;

// Compuesto
public class Paquete implements IProducto {
    private List<IProducto> productos = new ArrayList<>();

    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    @Override
    public double obtenerPrecio() {
        double total = 0;
        for (IProducto producto : productos) {
            total += producto.obtenerPrecio();
        }
        return total;
    }

    @Override
    public void mostrar() {
        System.out.println("Paquete:");
        for (IProducto producto : productos) {
            producto.mostrar();
        }
    }
}