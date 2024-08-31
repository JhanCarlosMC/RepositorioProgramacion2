package co.edu.uniquindio;

import co.edu.uniquindio.factory.ModelFactory;
import co.edu.uniquindio.model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainTransporte {
    /**
     * Metodo principal que inicia la aplicación.
     * Crea la empresa de transporte y muestra el menú principal.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        calcularTotalPasajeros(modelFactory);

//    System.out.println(empresaTransporte.toString());

    }


    /**
     * Calcula y muestra el total de pasajeros transportados por un vehículo de transporte en un día,
     * según la placa ingresada.
     *
     */
    private static void calcularTotalPasajeros(ModelFactory modelFactory) {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo");

        String mensaje = modelFactory.calcularTotalPasajeros(placa);
    }






    /**
     * Muestra el menú principal para gestionar las operaciones de la empresa de transporte.
     *
     * @param empresaTransporte La instancia de EmpresaTransporte que contiene los datos a gestionar.
     */
    private static void menuPrincipal(EmpresaTransporte empresaTransporte) {

        String option;
        do {

            option = JOptionPane.showInputDialog("Bienvenido al Menu de gestion: \n\n"
                    + "1. Crear propietario y su vehiculo de carga. \n"
                    + "2. Calcular total de pasajeros transportados en un dia segun la placa.\n"
                    + "3. Calcular lista de usuarios mayores a un peso.\n"
                    + "4. Obtener numero de propietarios mayores de 40 años.\n"
                    + "5. Encontrar usuarios en un rango de edad.\n\n"
                    + "0. Salir");

            switch (option) {
                case "1":
                    crearPropietarioVehiculoCarga(empresaTransporte);
                    break;

                case "2":
//                    calcularTotalPasajeros(empresaTransporte);
                    break;

                case "3":
                    calcularUsuariosPorPeso(empresaTransporte);
                    break;

                case "4":
                    calcularPropietariosMayoresDe40(empresaTransporte);
                    break;

                case "5":
                    encontrarUsuariosPorRangoDeEdad(empresaTransporte);
                    break;

                case "0":
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida.");
            }

        } while (!option.equals("0"));
    }

    /**
     * Crea un nuevo propietario y un nuevo vehículo de carga, y los agrega a la empresa de transporte.
     *
     * @param empresaTransporte La instancia de EmpresaTransporte a la cual se agregará el propietario y su vehículo.
     * @return La instancia de EmpresaTransporte actualizada.
     */
    private static EmpresaTransporte crearPropietarioVehiculoCarga(EmpresaTransporte empresaTransporte) {
        Propietario newPropietario = new Propietario();
        newPropietario.setCedula(JOptionPane.showInputDialog("Ingrese la cedula del propietario"));
        newPropietario.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del propietario"));
        newPropietario.setEmail(JOptionPane.showInputDialog("Ingrese el email del propietario"));
        newPropietario.setNumeroCelular(JOptionPane.showInputDialog("Ingrese el numero de celular del propietario"));

        VehiculoCarga newVehiculoCarga = new VehiculoCarga();
        newVehiculoCarga.setPlaca(JOptionPane.showInputDialog("Ingrese la placa del vehiculo"));
        newVehiculoCarga.setColor(JOptionPane.showInputDialog("Ingrese el color del vehiculo"));
        newVehiculoCarga.setMarca(JOptionPane.showInputDialog("Ingrese la marca del vehiculo"));
        newVehiculoCarga.setModelo(JOptionPane.showInputDialog("Ingrese el modelo del vehiculo"));
        newVehiculoCarga.setCapacidadCarga(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad del vahiculo")));

        newVehiculoCarga.setPropietarioAsociado(newPropietario);
        newPropietario.setVehiculoAsociado(newVehiculoCarga);

        empresaTransporte.setPropietarioAsociado(newPropietario);
        empresaTransporte.setVehiculoCargaToList(newVehiculoCarga);

        return empresaTransporte;
    }


    /**
     * Calcula y muestra la lista de vehículos de carga que tienen una capacidad mayor a un peso dado.
     *
     * @param empresaTransporte La instancia de EmpresaTransporte que contiene los vehículos de carga a consultar.
     */
    private static void calcularUsuariosPorPeso(EmpresaTransporte empresaTransporte) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso mínimo"));

        List<VehiculoCarga> vehiculosFiltrados = new ArrayList<>();
        for (VehiculoCarga vehiculo : empresaTransporte.getListVehiculosCarga()) {
            if (vehiculo.getCapacidadCarga() > peso) {
                vehiculosFiltrados.add(vehiculo);
            }
        }

        if (vehiculosFiltrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay vehículos con capacidad de carga superior a " + peso + "kg.");
        } else {
            StringBuilder resultado = new StringBuilder("Vehículos con capacidad de carga superior a " + peso + "kg:\n");
            for (VehiculoCarga vehiculo : vehiculosFiltrados) {
                resultado.append("Placa: ").append(vehiculo.getPlaca()).append(", Capacidad: ").append(vehiculo.getCapacidadCarga()).append("kg\n");
            }
            JOptionPane.showMessageDialog(null, resultado.toString());
        }
    }

    /**
     * Calcula y muestra el número de propietarios que son mayores de 40 años.
     *
     * @param empresaTransporte La instancia de EmpresaTransporte que contiene los propietarios a consultar.
     */
    private static void calcularPropietariosMayoresDe40(EmpresaTransporte empresaTransporte) {
        int contador = 0;

        for (Propietario propietario : empresaTransporte.getListaAsociados()) {
            if (propietario.getEdad() > 40) {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "Número de propietarios mayores de 40 años: " + contador);
    }

    /**
     * Encuentra y muestra los usuarios que están dentro de un rango de edad especificado.
     *
     * @param empresaTransporte La instancia de EmpresaTransporte que contiene los usuarios a consultar.
     */
    private static void encontrarUsuariosPorRangoDeEdad(EmpresaTransporte empresaTransporte) {
        int edadMinima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad mínima"));
        int edadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad máxima"));

        List<Usuario> usuarioFiltrados = new ArrayList<>();
        for (Usuario usuario : empresaTransporte.getListUsuarios()) {
            if (usuario.getEdad() >= edadMinima && usuario.getEdad() <= edadMaxima) {
                usuarioFiltrados.add(usuario);
            }
        }

        if (usuarioFiltrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay usuarios en el rango de edad especificado.");
        } else {
            String resultado = "Usuarios en el rango de edad " + edadMinima + " - " + edadMaxima + ":\n";
            for (Usuario usuario : usuarioFiltrados) {
                resultado += "Nombre: " + usuario.getNombre() + ", Edad: " + usuario.getEdad() + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

}