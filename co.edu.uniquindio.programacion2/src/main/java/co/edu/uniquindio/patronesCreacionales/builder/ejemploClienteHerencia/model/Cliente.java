package co.edu.uniquindio.patronesCreacionales.builder.ejemploClienteHerencia.model;

public class Cliente {
    private String nombre;
    private String email;
    private String telefono;

    public Cliente(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
}
