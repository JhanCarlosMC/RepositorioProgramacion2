package co.edu.uniquindio.prestamocrud.model;

import co.edu.uniquindio.prestamocrud.model.bilder.ClienteBuilder;

public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String telefonoCelular;
    private String direccion;
    private int edad;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, String email, String telefonoCelular, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
    }

    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefonoCelular='" + telefonoCelular + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
