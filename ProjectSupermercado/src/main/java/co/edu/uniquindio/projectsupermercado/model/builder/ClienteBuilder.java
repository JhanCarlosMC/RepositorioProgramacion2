package co.edu.uniquindio.projectsupermercado.model.builder;

import co.edu.uniquindio.projectsupermercado.model.Cliente;

public class ClienteBuilder {
    protected String cedula;
    protected String nombre;
    protected String telefono;
    protected String direccion;

    public ClienteBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public ClienteBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ClienteBuilder telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public ClienteBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Cliente build() {
        return new Cliente(cedula, nombre, telefono, direccion);
    }
}
