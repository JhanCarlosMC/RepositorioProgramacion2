package co.edu.uniquindio.prestamocrud.service;

import co.edu.uniquindio.prestamocrud.model.Cliente;

import java.util.List;

public interface ICrudCliente {
   boolean crearCliente(String cedula, String nombre, String apellido, String email, String telefonoCelular, String direccion);
    boolean eliminarCliente(String cedula);
    boolean modificarCliente(String cedula,String nombre, String apellido, String email, String telefonoCelular, String direccion);
    Cliente buscarCliente(String cedula);
    List<Cliente> listarClientes();

    boolean verificarClienteExistente(String cedula);
}
