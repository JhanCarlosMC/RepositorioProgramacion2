package co.edu.uniquindio.prestamocrud.service;

import co.edu.uniquindio.prestamocrud.mapping.dto.ClienteDto;

import java.util.List;

public interface IClienteControllerService {
    List<ClienteDto> obtenerClientesDto();
    boolean agregarCliente(ClienteDto clienteDto);
    boolean actualizarCliente(String cedulaActual, ClienteDto clienteDto);
    boolean eliminarCliente(String cedula);
}
