package co.edu.uniquindio.projectsupermercado.mapping.dto;

public record ProductoDto(
        String idProducto,
        String nombre,
        double precio,
        int cantDisponible
) {
}
