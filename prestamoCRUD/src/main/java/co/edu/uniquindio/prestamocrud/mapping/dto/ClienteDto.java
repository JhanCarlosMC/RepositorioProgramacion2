package co.edu.uniquindio.prestamocrud.mapping.dto;

public record ClienteDto(
        String cedula,
        String nombre,
        String apellido,
        String email,
        String telefonoCelular,
        String direccion
) {
}
