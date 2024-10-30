package co.edu.uniquindio.projectsupermercado.mapping.mapper;

import co.edu.uniquindio.projectsupermercado.mapping.dto.ProductoDto;
import co.edu.uniquindio.projectsupermercado.mapping.dto.ProveedorDto;
import co.edu.uniquindio.projectsupermercado.model.Producto;
import co.edu.uniquindio.projectsupermercado.model.Proveedor;
import co.edu.uniquindio.projectsupermercado.service.ISupermercadoMapping;

import java.util.ArrayList;
import java.util.List;

public class SupermercadoMappingImpl implements ISupermercadoMapping {
    @Override
    public List<ProductoDto> getProductosDto(List<Producto> listProductos) {
        if(listProductos==null){
            return null;
        }

        List<ProductoDto> productosDto = new ArrayList<>();
        for (Producto producto : listProductos) {
            productosDto.add(productoToProductoDto(producto));
        }

        return productosDto;
    }

    @Override
    public ProductoDto productoToProductoDto(Producto producto) {
        return new ProductoDto(
                producto.getIdProducto(),
                producto.getNombre(),
                producto.getPrecio(),
                producto.getCantDisponible());
    }

    @Override
    public Producto productoDtoToProducto(ProductoDto productoDto) {
        return Producto.builder()
                .idProducto(productoDto.idProducto())
                .nombre(productoDto.nombre())
                .precio(productoDto.precio())
                .cantDisponible(productoDto.cantDisponible())
                .build();
    }

    @Override
    public Proveedor proveedorDtoToProveedor(ProveedorDto proveedorDto) {
        Proveedor newProveedor = new Proveedor();
        newProveedor.setNombre(proveedorDto.nombre());
        newProveedor.setIdproveedor(proveedorDto.id());

        return newProveedor;
    }


}
