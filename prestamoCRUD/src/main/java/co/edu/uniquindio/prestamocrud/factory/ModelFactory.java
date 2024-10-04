package co.edu.uniquindio.prestamocrud.factory;

import co.edu.uniquindio.prestamocrud.mapping.dto.ClienteDto;
import co.edu.uniquindio.prestamocrud.mapping.mappers.EmpresaPrestamoMappingImpl;
import co.edu.uniquindio.prestamocrud.model.Cliente;
import co.edu.uniquindio.prestamocrud.model.EmpresaPrestamo;
import co.edu.uniquindio.prestamocrud.service.IModelFactoryService;

import java.util.List;

public class ModelFactory implements IModelFactoryService {
    private static ModelFactory instance;
    EmpresaPrestamo empresaPrestamo;
    EmpresaPrestamoMappingImpl mapper;

    public static ModelFactory getInstance(){
        if(instance == null){
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory(){
        mapper = new EmpresaPrestamoMappingImpl();
        empresaPrestamo = inicializarDatos();
    }

    public EmpresaPrestamo getEmpresaPrestamo() {
        return empresaPrestamo;
    }

    public void setEmpresaPrestamo(EmpresaPrestamo empresaPrestamo) {
        this.empresaPrestamo = empresaPrestamo;
    }

    @Override
    public List<ClienteDto> obtenerClientes() {
        return mapper.getClientesDto(empresaPrestamo.getListClientes());
    }

    @Override
    public boolean agregarCliente(ClienteDto clienteDto) {
        if (empresaPrestamo.verificarClienteExistente(clienteDto.cedula())){

            Cliente newCliente = mapper.clienteDtoToCliente(clienteDto);

            getEmpresaPrestamo().crearCliente(newCliente);
            return true;

        }
        return false;
    }

    @Override
    public boolean eliminarCliente(String cedula) {
        return false;
    }

    @Override
    public boolean actualizarCliente(String cedulaActual, ClienteDto clienteDto) {
        return false;
    }


    public static EmpresaPrestamo inicializarDatos() {
        EmpresaPrestamo empresaPrestamo = new EmpresaPrestamo();
        Cliente cliente1 = Cliente.builder()
                .cedula("1094")
                .nombre("juan")
                .apellido("arias")
                .direccion("armenia")
                .build();

        Cliente cliente2 = Cliente.builder()
                .cedula("1095")
                .nombre("Ana")
                .apellido("cardenas")
                .direccion("quimbaya")
                .build();

        Cliente cliente3 = Cliente.builder()
                .cedula("1096")
                .nombre("Pedro")
                .apellido("perez")
                .direccion("armenia")
                .build();

        empresaPrestamo.getListClientes().add(cliente1);
        empresaPrestamo.getListClientes().add(cliente2);
        empresaPrestamo.getListClientes().add(cliente3);

        return empresaPrestamo;
    }
}
