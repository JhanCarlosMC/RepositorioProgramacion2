package co.edu.uniquindio.patronesCreacionales.builder.ejemploClienteHerencia.builder;


import co.edu.uniquindio.patronesCreacionales.builder.ejemploClienteHerencia.model.ClientePremium;

public class ClientePremiumBuilder extends ClienteBuilder<ClientePremiumBuilder> {
    private String nivelDeMembresia;

    public ClientePremiumBuilder nivelDeMembresia(String nivelDeMembresia) {
        this.nivelDeMembresia = nivelDeMembresia;
        return this;
    }

    @Override
    public ClientePremium build() {
        return new ClientePremium(nombre, email, telefono, nivelDeMembresia);
    }

    @Override
    protected ClientePremiumBuilder self() {
        return this;
    }
}
