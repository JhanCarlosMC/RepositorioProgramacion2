package co.edu.uniquindio.prestamocrud.controller;

import co.edu.uniquindio.prestamocrud.factory.ModelFactory;
import co.edu.uniquindio.prestamocrud.mapping.dto.ClienteDto;
import co.edu.uniquindio.prestamocrud.service.IClienteControllerService;

import java.util.List;

public class ClienteController implements IClienteControllerService {
    ModelFactory modelFactory;
    public ClienteController(){
        modelFactory = ModelFactory.getInstance();
    }
    public List<ClienteDto> obtenerClientes() {
        return modelFactory.obtenerClientes();
    }


    @Override
    public List<ClienteDto> obtenerClientesDto() {
        return List.of();
    }

    @Override
    public boolean agregarCliente(ClienteDto clienteDto) {
        return modelFactory.agregarCliente(clienteDto);
    }

    @Override
    public boolean actualizarCliente(String cedulaActual, ClienteDto clienteDto) {
        return false;
    }

    @Override
    public boolean eliminarCliente(String cedula) {
        return false;
    }
}
