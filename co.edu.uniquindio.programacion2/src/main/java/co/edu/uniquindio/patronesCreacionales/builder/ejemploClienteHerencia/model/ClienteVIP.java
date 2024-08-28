package co.edu.uniquindio.patronesCreacionales.builder.ejemploClienteHerencia.model;

public class ClienteVIP extends Cliente {
    private String asesorAsignado;

    public ClienteVIP(String nombre, String email, String telefono, String asesorAsignado) {
        super(nombre, email, telefono);
        this.asesorAsignado = asesorAsignado;
    }

    // Getter
    public String getAsesorAsignado() { return asesorAsignado; }
}
