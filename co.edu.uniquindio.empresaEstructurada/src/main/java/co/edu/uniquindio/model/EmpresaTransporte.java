package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private String nombre;

    private List<Propietario> listPropietarios = new ArrayList<>();
    private List<VehiculoCarga> listVehiculosCarga = new ArrayList<>();
    private List<VehiculoTransporte> listVehiculosTransporte = new ArrayList<>();
    private List<Usuario> listUsuarios = new ArrayList<>();

    public EmpresaTransporte() {
    }

    @Override
    public String toString() {
        return "EmpresaTransporte{ \n" +
                "nombre='" + nombre + '\'' +
                ", \nlistPropietarios = " + listPropietarios.toString() +
                ", \nlistVehiculosCarga = " + listVehiculosCarga.toString() +
                ", \nlistVehiculosPasajeros = " + listVehiculosTransporte.toString() +
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

    public static List<VehiculoTransporte> getListVehiculosTransporte() {
        return listVehiculosTransporte;
    }

    public void setListVehiculosTransporte(List<VehiculoTransporte> listVehiculosTransporte) {
        this.listVehiculosTransporte = listVehiculosTransporte;
    }

    public List<Propietario> getListaAsociados() {
        return listPropietarios;
    }

    public void setListPropietarios(List<Propietario> listaPropietarios) {
        this.listPropietarios = listaPropietarios;
    }

    public void setPropietarioAsociado(Propietario propietario) {
        this.listPropietarios.add(propietario);
    }

    public void setVehiculoCargaToList(VehiculoCarga vehiculoCarga) {
        this.listVehiculosCarga.add(vehiculoCarga);
    }

    public void setVehiculoTransporteToList(VehiculoTransporte vehiculoTransporte) {
        this.listVehiculosTransporte.add(vehiculoTransporte);
    }

    public void setUsuarioToList(Usuario usuario){
        this.listUsuarios.add(usuario);
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    public List<Propietario> getListPropietarios() {
        return listPropietarios;
    }


    /**
     * Calcula y muestra el total de pasajeros transportados por un vehículo de transporte en un día,
     * según la placa ingresada.
     *
     * @return
     */
    public String calcularTotalPasajeros(String placa) {

        for (VehiculoTransporte vehiculo : getListVehiculosTransporte()) {
            if (vehiculo.getPlaca().equals(placa)) {
                int totalPasajeros = vehiculo.getTotalPasajeros();
                return "Total de pasajeros transportados: " + totalPasajeros;

            }
        }
        return "";
    }
}
