package co.edu.uniquindio.projectsupermercado.model;

import co.edu.uniquindio.projectsupermercado.model.builder.ProductoBuilder;

public class Producto {
  private String idProducto;
  private String nombre;
  private double precio;
  private int cantDisponible;
  private Proveedor proveedor;
  private CarritoCompras carritoCompras;

  public Producto() {
  }

  public Producto(String idProducto, String nombre, double precio, int cantDisponible) {
    this.idProducto = idProducto;
    this.nombre = nombre;
    this.precio = precio;
    this.cantDisponible = cantDisponible;
  }

  public static ProductoBuilder builder() {
    return new ProductoBuilder();
  }

  public String getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(String idProducto) {
    this.idProducto = idProducto;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCantDisponible() {
    return cantDisponible;
  }

  public void setCantDisponible(int cantDisponible) {
    this.cantDisponible = cantDisponible;
  }

  public Proveedor getProveedor() {
    return proveedor;
  }

  public void setProveedor(Proveedor proveedor) {
    this.proveedor = proveedor;
  }

  public CarritoCompras getCarritoCompras() {
    return carritoCompras;
  }

  public void setCarritoCompras(CarritoCompras carritoCompras) {
    this.carritoCompras = carritoCompras;
  }

  @Override
  public String toString() {
    return "Producto{" +
        "idProducto=" + idProducto +
        ", nombre='" + nombre + '\'' +
        ", precio=" + precio +
        ", cantDisponible=" + cantDisponible +
        '}';
  }
}
