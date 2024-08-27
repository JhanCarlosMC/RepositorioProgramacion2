package co.edu.uniquindio.empresaTransporte.model;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private String cedula;
    private String email;
    private String numeroCelular;
    private int edad;

    private List<Vehiculo> listaVehiculosAsociados = new ArrayList<>();
    private Vehiculo vehiculoAsociado;

    public Propietario() {
    }

    public Propietario(String nombre, String cedula, String email, String numeroCelular, Vehiculo vehiculoAsociado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.numeroCelular = numeroCelular;
        this.vehiculoAsociado = vehiculoAsociado;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", email='" + email + '\'' +
                ", numeroCelular='" + numeroCelular + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Vehiculo getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(Vehiculo vehiculo) {
        this.vehiculoAsociado = vehiculo;
    }

    public List<Vehiculo> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }

    public void setListaVehiculosAsociados(List<Vehiculo> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
