package co.edu.uniquindio.empresaTransporte.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private String nombre;

    private List<Propietario> listPropietarios = new ArrayList<>();
    private List<VehiculoCarga> listVehiculosCarga = new ArrayList<>();
    private List<VehiculoTransporte> listVehiculosPasajeros = new ArrayList<>();
    private List<Usuario> listUsuarios = new ArrayList<>();

    public EmpresaTransporte() {
    }

    @Override
    public String toString() {
        return "EmpresaTransporte{ \n" +
                "nombre='" + nombre + '\'' +
                ", \nlistPropietarios = " + listPropietarios.toString() +
                ", \nlistVehiculosCarga = " + listVehiculosCarga.toString() +
                ", \nlistVehiculosPasajeros = " + listVehiculosPasajeros.toString() +
                ", \nlistUsuarios = " + listUsuarios.toString() +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VehiculoCarga> getListVehiculosCarga() {
        return listVehiculosCarga;
    }

    public void setListVehiculosCarga(List<VehiculoCarga> listVehiculosCarga) {
        this.listVehiculosCarga = listVehiculosCarga;
    }

    public List<VehiculoTransporte> getListVehiculosPasajeros() {
        return listVehiculosPasajeros;
    }

    public void setListVehiculosPasajeros(List<VehiculoTransporte> listVehiculosPasajeros) {
        this.listVehiculosPasajeros = listVehiculosPasajeros;
    }

    public List<Propietario> getListaAsociados() {
        return listPropietarios;
    }

    public void setListaAsociados(List<Propietario> listaPropietarios) {
        this.listPropietarios = listaPropietarios;
    }
}
