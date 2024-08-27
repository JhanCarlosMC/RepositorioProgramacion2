package co.edu.uniquindio.patronesCreacionales.builder.ejemploCliente.model;

public class ClienteBuilder {

    //Son protegidos (protected) para que las subclases puedan acceder a ellos directamente si es necesario.
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String numeroCelular;
    protected String direccion;


    public Cliente build(){
        return new Cliente(cedula,nombre,apellido,email,numeroCelular,direccion);
    }


    public ClienteBuilder cedula(String cedula){
        this.cedula = cedula;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder nombre(String nombre){
        this.nombre = nombre;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder apellido(String apellido){
        this.apellido = apellido;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder email(String email){
        this.email = email;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder numeroCelular(String numeroCelular){
        this.numeroCelular = numeroCelular;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuilder direccion(String direccion){
        this.direccion = direccion;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }
}
