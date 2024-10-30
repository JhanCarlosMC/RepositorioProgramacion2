package co.edu.uniquindio.projectsupermercado.model;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private String idCarrito;
    private Cliente cliente;
    List<Producto> listProductos = new ArrayList<>();

    public CarritoCompras() {
    }

    public CarritoCompras(String idCarrito) {
        this.idCarrito = idCarrito;
    }

    public String getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(String idCarrito) {
        this.idCarrito = idCarrito;
    }

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CarritoCompras{" +
                "idCarrito='" + idCarrito + '\'' +
                ", listProductos=" + listProductos +
                ", cliente=" + cliente +
                '}';
    }
}
