package co.edu.uniquindio.model;

public class Usuario {
    private String nombre;
    private int edad;

    private VehiculoTransporte vehiculoAsociado;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, VehiculoTransporte vehiculoAsociado) {
        this.nombre = nombre;
        this.edad = edad;
        this.vehiculoAsociado = vehiculoAsociado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public VehiculoTransporte getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(VehiculoTransporte vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }
}
