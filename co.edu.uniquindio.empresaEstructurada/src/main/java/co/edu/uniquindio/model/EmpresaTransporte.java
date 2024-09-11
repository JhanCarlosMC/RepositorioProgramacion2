package co.edu.uniquindio.model;

import co.edu.uniquindio.services.ICrudUsuario;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte implements ICrudUsuario {

    private String nombre;

    private List<Propietario> listPropietarios = new ArrayList<>();
    private List<VehiculoCarga> listVehiculosCarga = new ArrayList<>();
    private List<VehiculoTransporte> listVehiculosTransporte = new ArrayList<>();
    private List<Usuario> listUsuarios = new ArrayList<>();

    public EmpresaTransporte() {
    }

    @Override
    public boolean crearUsuario(String nombre, int edad) {
        Usuario newUsuario = new Usuario();

        Usuario usuarioExistente = verificarUsuario(nombre);

        if(usuarioExistente == null){
            newUsuario.setNombre(nombre);
            newUsuario.setEdad(edad);
            listUsuarios.add(newUsuario);

            return true;
        }

        return false;
    }

@Override
public boolean eliminarUsuario(String nombre) {
    Usuario usuario = verificarUsuario(nombre);
    if (usuario != null) {
        listUsuarios.remove(usuario);
        return true;
    }
    return false;
}

@Override
public boolean modificarUsuario(String nombre, int edad) {
    Usuario usuario = verificarUsuario(nombre);
    if (usuario != null) {
        usuario.setEdad(edad);
        return true;
    }
    return false;
}

@Override
public Usuario getUsuario(String nombre) {
    return verificarUsuario(nombre);
}

@Override
public ArrayList<Usuario> getUsuarios() {
    return listUsuarios;
}


    private Usuario verificarUsuario(String nombre) {
        Usuario usuarioExistente = null;

        for (Usuario usuario : listUsuarios) {
            if (usuario.getNombre().equals(nombre)) {
                usuarioExistente = usuario;
                break;
            }
        }

        return usuarioExistente;
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

    public List<VehiculoTransporte> getListVehiculosTransporte() {
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


}
