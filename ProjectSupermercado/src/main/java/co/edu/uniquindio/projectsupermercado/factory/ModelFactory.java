package co.edu.uniquindio.projectsupermercado.factory;

import co.edu.uniquindio.projectsupermercado.mapping.dto.ProductoDto;
import co.edu.uniquindio.projectsupermercado.mapping.dto.ProveedorDto;
import co.edu.uniquindio.projectsupermercado.mapping.mapper.SupermercadoMappingImpl;
import co.edu.uniquindio.projectsupermercado.model.Producto;
import co.edu.uniquindio.projectsupermercado.model.Supermercado;
import co.edu.uniquindio.projectsupermercado.service.IModelFactoryService;

import java.util.List;

public class ModelFactory implements IModelFactoryService {
    private static ModelFactory instance;
    Supermercado supermercado;
    SupermercadoMappingImpl mapper;

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory() {
        mapper = new SupermercadoMappingImpl();
        supermercado = inicializarDatos();
    }


    @Override
    public List<ProductoDto> getProductosDto() {
        return mapper.getProductosDto(getSupermercado().getListProductos());
    }

    @Override
    public boolean agregarProducto(ProductoDto productoDto) {
        if(getSupermercado().verificarProductoExistente(productoDto.idProducto())){
            Producto newProducto = mapper.productoDtoToProducto(productoDto);

            getSupermercado().crearProducto(newProducto);
            return true;
        }
        return false;
    }

    @Override
    public boolean actualizarProducto(String idActual, ProductoDto productoDto) {
        if(!getSupermercado().verificarProductoExistente(idActual)){
            Producto newProducto = mapper.productoDtoToProducto(productoDto);

            getSupermercado().actualizarProducto(idActual, newProducto);
            return true;
        }
        return false;
    }

    @Override
    public boolean crearProveedor(ProveedorDto proveedorDto) {
return true;
    }

    @Override
    public boolean eliminarProducto(String idProducto) {
        return getSupermercado().eliminarProducto(idProducto);
    }


    public static Supermercado inicializarDatos(){
        Supermercado supermercado = new Supermercado();
        supermercado.setNombre("Supermercado");

        Producto newProducto = Producto.builder()
                .idProducto("1")
                .nombre("Cepillo")
                .precio(1000)
                .cantDisponible(10)
                .build();

        Producto newProducto2 = Producto.builder()
                .idProducto("2")
                .nombre("Camisa")
                .precio(70000)
                .cantDisponible(5)
                .build();

        supermercado.getListProductos().add(newProducto);
        supermercado.getListProductos().add(newProducto2);

        return supermercado;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }
}
