package co.edu.uniquindio.projectsupermercado.service;

import co.edu.uniquindio.projectsupermercado.mapping.dto.ProductoDto;

import java.util.List;

public interface IProductoControllerService {
    List<ProductoDto> getProductosDto();
    boolean agregarProducto(ProductoDto producto);
    boolean eliminarProducto(String idProducto);
    boolean actualizarProducto(String idActual, ProductoDto producto);
}
