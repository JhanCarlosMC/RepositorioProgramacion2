package co.edu.uniquindio.prestamocrud.model;

import co.edu.uniquindio.prestamocrud.service.ICrudCliente;

import java.util.ArrayList;
import java.util.List;

public class EmpresaPrestamo implements ICrudCliente {
    List<Cliente> listClientes = new ArrayList<>();
    List<Objeto> listObjetos = new ArrayList<>();

    private String nombre;

    public EmpresaPrestamo() {
    }


    @Override
    public boolean crearCliente(String cedula, String nombre, String apellido, String email, String telefonoCelular, String direccion) {
        Cliente clienteEncontrado = verificarCliente(cedula);

        if (clienteEncontrado == null) {
            Cliente cliente = Cliente.builder()
                    .nombre(nombre)
                    .cedula(cedula)
                    .apellido(apellido)
                    .email(email)
                    .telefonoCelular(telefonoCelular)
                    .direccion(direccion)
                    .build();

            getListClientes().add(cliente);

            return true;
        }

        return false;
    }

    @Override
    public boolean eliminarCliente(String cedula) {
        Cliente clienteEncontrado = verificarCliente(cedula);
        if (clienteEncontrado != null) {
            getListClientes().remove(clienteEncontrado);
            return true;
        }
        return false;
    }

    @Override
    public boolean modificarCliente(String cedula, String nombre, String apellido, String email, String telefonoCelular, String direccion) {
        Cliente clienteEncontrado = verificarCliente(cedula);
        if (clienteEncontrado != null) {
            clienteEncontrado.setNombre(nombre);
            clienteEncontrado.setApellido(apellido);
            clienteEncontrado.setEmail(email);
            clienteEncontrado.setTelefonoCelular(telefonoCelular);
            clienteEncontrado.setDireccion(direccion);

            return true;
        }
        return false;
    }

    @Override
    public Cliente buscarCliente(String cedula) {
        Cliente clienteEncontrado = verificarCliente(cedula);
        if (clienteEncontrado != null) {
            return clienteEncontrado;
        }
        return null;
    }

    @Override
    public List<Cliente> listarClientes() {
        return List.of();
    }

    @Override
    public boolean verificarClienteExistente(String cedula) {
        if (verificarCliente(cedula) == null){
            return true;
        }
        return false;
    }

    public Cliente verificarCliente(String cedula) {
        Cliente clienteExistente = null;

        for (Cliente cliente : listClientes) {
            if (cliente.getCedula().equals(cedula)) {
                clienteExistente = cliente;
                break;
            }
        }
        return clienteExistente;
    }

    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public void setListClientes(List<Cliente> listClientes) {
        this.listClientes = listClientes;
    }

    public List<Objeto> getListObjetos() {
        return listObjetos;
    }

    public void setListObjetos(List<Objeto> listObjetos) {
        this.listObjetos = listObjetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
