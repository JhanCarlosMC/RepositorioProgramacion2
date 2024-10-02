package co.edu.uniquindio.prestamocrud.mapping.mappers;

import co.edu.uniquindio.prestamocrud.mapping.dto.ClienteDto;
import co.edu.uniquindio.prestamocrud.model.Cliente;
import co.edu.uniquindio.prestamocrud.service.IEmpresaPrestamoMapping;

import java.util.ArrayList;
import java.util.List;

public class EmpresaPrestamoMappingImpl implements IEmpresaPrestamoMapping {
    @Override
    public List<ClienteDto> getClientesDto(List<Cliente> listaClientes) {
        if(listaClientes == null){
            return null;
        }

        List<ClienteDto> listaClientesDto = new ArrayList<ClienteDto>(listaClientes.size());
        for (Cliente cliente : listaClientes) {
            listaClientesDto.add(clienteToClienteDto(cliente));
        }

        return listaClientesDto;
    }

    @Override
    public ClienteDto clienteToClienteDto(Cliente cliente) {
        return new ClienteDto(
                cliente.getCedula(),
                cliente.getNombre(),
                cliente.getApellido(),
                cliente.getEmail(),
                cliente.getTelefonoCelular(),
                cliente.getDireccion());
    }

    @Override
    public Cliente clienteDtoToCliente(ClienteDto clienteDto) {
        return Cliente.builder()
                .nombre(clienteDto.nombre())
                .direccion(clienteDto.direccion())
                .apellido(clienteDto.apellido())
                .cedula(clienteDto.cedula())
                .email(clienteDto.email())
                .telefonoCelular(clienteDto.telefonoCelular())
                .build();
    }
}
