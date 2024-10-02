package co.edu.uniquindio.prestamocrud.model.bilder;

import co.edu.uniquindio.prestamocrud.model.Cliente;

public class ClienteBuilder {
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String telefonoCelular;
    protected String direccion;

    public ClienteBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public ClienteBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ClienteBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public ClienteBuilder email(String email) {
        this.email = email;
        return this;
    }
    public ClienteBuilder telefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
        return this;
    }
    public ClienteBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
    public Cliente build() {
        return new Cliente(cedula,nombre,apellido,email,telefonoCelular,direccion);
    }
}
