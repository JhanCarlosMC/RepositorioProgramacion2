package co.edu.uniquindio.projectsupermercado.model;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private int idproveedor;
    private String nombre;
    List<Producto> listProductos = new ArrayList<>();

    public Proveedor() {}

    public Proveedor(int idproveedor, String nombre) {
        this.idproveedor = idproveedor;
        this.nombre = nombre;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "idproveedor=" + idproveedor +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

