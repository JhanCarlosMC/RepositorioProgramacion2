package co.edu.uniquindio.projectsupermercado.model.builder;

import co.edu.uniquindio.projectsupermercado.model.Producto;

public class ProductoBuilder {
    protected String idProducto;
    protected String nombre;
    protected double precio;
    protected int cantDisponible;

    public ProductoBuilder idProducto(String idProducto) {
        this.idProducto = idProducto;
        return this;
    }

    public ProductoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder precio(double precio) {
        this.precio = precio;
        return this;
    }
    public ProductoBuilder cantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
        return this;
    }

    public Producto build() {
        return new Producto(idProducto, nombre, precio, cantDisponible);
    }
}
