package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Usuario;

import java.util.ArrayList;

public interface ICrudUsuario {

    public boolean crearUsuario(String nombre, int edad);
    public boolean eliminarUsuario(String nombre);
    public boolean modificarUsuario(String nombre, int edad);
    public Usuario getUsuario(String nombre);
    public ArrayList<Usuario> getUsuarios();

}
