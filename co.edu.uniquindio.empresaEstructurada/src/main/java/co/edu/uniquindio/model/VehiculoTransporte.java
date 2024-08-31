package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends Vehiculo {
    private int numeroMaximoPasajeros;

    private List<Usuario> listUsuariosAsociados = new ArrayList<>();

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(String placa, String modelo, String marca, String color, int numeroMaximoPasajeros) {
        super(placa, modelo, marca, color);
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }

    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    public int getTotalPasajeros() {
        return this.listUsuariosAsociados.size();
    }

    public List<Usuario> getListUsuariosAsociados() {
        return listUsuariosAsociados;
    }

    public void setListUsuariosAsociados(List<Usuario> listUsuariosAsociados) {
        this.listUsuariosAsociados = listUsuariosAsociados;
    }

    public void setUsuarioToList(Usuario usuario){
        this.listUsuariosAsociados.add(usuario);
    }
}
