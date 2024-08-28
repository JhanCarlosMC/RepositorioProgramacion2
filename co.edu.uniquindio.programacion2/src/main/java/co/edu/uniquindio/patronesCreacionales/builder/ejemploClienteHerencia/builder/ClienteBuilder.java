package co.edu.uniquindio.patronesCreacionales.builder.ejemploClienteHerencia.builder;


import co.edu.uniquindio.patronesCreacionales.builder.ejemploClienteHerencia.model.Cliente;

public class ClienteBuilder<T extends ClienteBuilder<T>> {
    protected String nombre;
    protected String email;
    protected String telefono;

    public T nombre(String nombre) {
        this.nombre = nombre;
        return self();
    }

    public T email(String email) {
        this.email = email;
        return self();
    }

    public T telefono(String telefono) {
        this.telefono = telefono;
        return self();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public Cliente build() {
        return new Cliente(nombre, email, telefono);
    }
}
