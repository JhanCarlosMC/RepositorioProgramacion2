package co.edu.uniquindio.patronesCreacionales.builder.ejemploClienteHerencia.builder;


import co.edu.uniquindio.patronesCreacionales.builder.ejemploClienteHerencia.model.ClienteVIP;

public class ClienteVIPBuilder extends ClienteBuilder<ClienteVIPBuilder> {
    private String asesorAsignado;

    public ClienteVIPBuilder asesorAsignado(String asesorAsignado) {
        this.asesorAsignado = asesorAsignado;
        return this;
    }

    @Override
    public ClienteVIP build() {
        return new ClienteVIP(nombre, email, telefono, asesorAsignado);
    }

    @Override
    protected ClienteVIPBuilder self() {
        return this;
    }
}
