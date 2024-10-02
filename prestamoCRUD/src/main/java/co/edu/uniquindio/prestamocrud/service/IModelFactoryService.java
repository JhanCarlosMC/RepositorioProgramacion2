package co.edu.uniquindio.prestamocrud.service;

import co.edu.uniquindio.prestamocrud.mapping.dto.ClienteDto;

import java.util.List;

public interface IModelFactoryService {
    List<ClienteDto> obtenerClientes();
    boolean agregarCliente(ClienteDto clienteDto);

    boolean eliminarCliente(String cedula);

    boolean actualizarCliente(String cedulaActual, ClienteDto clienteDto);

}
