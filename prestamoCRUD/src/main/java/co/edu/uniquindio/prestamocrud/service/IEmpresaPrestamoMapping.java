package co.edu.uniquindio.prestamocrud.service;

import co.edu.uniquindio.prestamocrud.mapping.dto.ClienteDto;
import co.edu.uniquindio.prestamocrud.model.Cliente;

import java.util.List;

public interface IEmpresaPrestamoMapping {
    List<ClienteDto> getClientesDto(List<Cliente> listaClientes);
    ClienteDto clienteToClienteDto(Cliente cliente);
    Cliente clienteDtoToCliente(ClienteDto clienteDto);
}
