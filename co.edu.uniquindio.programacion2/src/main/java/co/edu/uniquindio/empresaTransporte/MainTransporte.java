package co.edu.uniquindio.empresaTransporte;

import co.edu.uniquindio.empresaTransporte.model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainTransporte {
    public static void main(String[] args) {
        EmpresaTransporte empresaTransporte = inicializarDatos();

        menuPrincipal(empresaTransporte);

//    System.out.println(empresaTransporte.toString());

    }


    private static EmpresaTransporte inicializarDatos() {
        EmpresaTransporte empresaTransporte = new EmpresaTransporte();
        empresaTransporte.setNombre("Transportes SA");

        Propietario propietario = new Propietario();
        propietario.setNombre("Pedro");
        Propietario asociad2 = new Propietario();
        asociad2.setNombre("Ana");

        VehiculoCarga vehiculoCarga1 = new VehiculoCarga();
        vehiculoCarga1.setPlaca("RRD098");
        vehiculoCarga1.setNumeroEjes(5);

        VehiculoCarga vehiculoCarga2 = new VehiculoCarga();
        vehiculoCarga2.setPlaca("XXX096");
        vehiculoCarga2.setNumeroEjes(3);

        VehiculoCarga vehiculoCarga3 = new VehiculoCarga();
        vehiculoCarga3.setPlaca("77X096");
        vehiculoCarga3.setNumeroEjes(5);

        propietario.setVehiculoAsociado(vehiculoCarga1);
        propietario.getListaVehiculosAsociados().add(vehiculoCarga2);
        propietario.getListaVehiculosAsociados().add(vehiculoCarga3);

        asociad2.setVehiculoAsociado(vehiculoCarga2);

        empresaTransporte.getListaAsociados().add(propietario);
        empresaTransporte.getListaAsociados().add(asociad2);

        empresaTransporte.getListVehiculosCarga().add(vehiculoCarga1);
        empresaTransporte.getListVehiculosCarga().add(vehiculoCarga2);
        empresaTransporte.getListVehiculosCarga().add(vehiculoCarga3);

        return empresaTransporte;
    }


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
                    calcularTotalPasajeros(empresaTransporte);
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
        empresaTransporte.setVehiculoCargaAsociado(newVehiculoCarga);

        return empresaTransporte;
    }

    private static void calcularTotalPasajeros(EmpresaTransporte empresaTransporte) {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo");

        for (VehiculoTransporte vehiculo : empresaTransporte.getListVehiculosPasajeros()) {
            if (vehiculo.getPlaca().equals(placa)) {
                int totalPasajeros = vehiculo.getTotalPasajeros();
                JOptionPane.showMessageDialog(null, "Total de pasajeros transportados: " + totalPasajeros);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
    }

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

    private static void calcularPropietariosMayoresDe40(EmpresaTransporte empresaTransporte) {
        int contador = 0;

        for (Propietario propietario : empresaTransporte.getListaAsociados()) {
            if (propietario.getEdad() > 40) {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "Número de propietarios mayores de 40 años: " + contador);
    }

    private static void encontrarUsuariosPorRangoDeEdad(EmpresaTransporte empresaTransporte) {
        int edadMinima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad mínima"));
        int edadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad máxima"));

        List<Propietario> propietariosFiltrados = new ArrayList<>();
        for (Propietario propietario : empresaTransporte.getListaAsociados()) {
            if (propietario.getEdad() >= edadMinima && propietario.getEdad() <= edadMaxima) {
                propietariosFiltrados.add(propietario);
            }
        }

        if (propietariosFiltrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay propietarios en el rango de edad especificado.");
        } else {
            StringBuilder resultado = new StringBuilder("Propietarios en el rango de edad " + edadMinima + " - " + edadMaxima + ":\n");
            for (Propietario propietario : propietariosFiltrados) {
                resultado.append("Nombre: ").append(propietario.getNombre()).append(", Edad: ").append(propietario.getEdad()).append("\n");
            }
            JOptionPane.showMessageDialog(null, resultado.toString());
        }
    }

}