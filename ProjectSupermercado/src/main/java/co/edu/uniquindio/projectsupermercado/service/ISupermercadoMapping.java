package co.edu.uniquindio.projectsupermercado.service;

import co.edu.uniquindio.projectsupermercado.mapping.dto.ProductoDto;
import co.edu.uniquindio.projectsupermercado.mapping.dto.ProveedorDto;
import co.edu.uniquindio.projectsupermercado.model.Producto;
import co.edu.uniquindio.projectsupermercado.model.Proveedor;

import java.util.List;

public interface ISupermercadoMapping {
    // Producto Mapping
    List<ProductoDto> getProductosDto(List<Producto> productos);
    ProductoDto productoToProductoDto(Producto producto);
    Producto productoDtoToProducto(ProductoDto productoDto);

    Proveedor proveedorDtoToProveedor(ProveedorDto proveedorDto);
}
