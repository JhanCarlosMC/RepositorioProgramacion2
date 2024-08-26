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


    private void menuPrincipal(EmpresaTransporte empresaTransporte){

        do{

            String option = JOptionPane.showInputDialog("Bienvenido al Menu de gestion: \n\n " +
                    "1. Crear propietario y su vehiculo de carga. \n\n" +
                    "2. Calcular total de pasajeros transportados en un dia segun la placa\n\n" +
                    "3. Calcular lista de usuarios mayores a un peso\n\n" +
                    "4. Obtener numero de propietarios \n\n");

            switch (option){
                case "1":
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                default:

            }

        }while (true);
    }

    private static void asociarVehiculo() {
        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setPlaca("ABC123");
        vehiculoCarga.setModelo("2020");
        vehiculoCarga.setMarca("Volvo");
        vehiculoCarga.setColor("Blanco");
        vehiculoCarga.setCapacidadCarga(2000);
        vehiculoCarga.setNumeroEjes(4);


        Propietario propietario = new Propietario();
        propietario.setNombre("Carlos López");
        propietario.setCedula("98765432");
        propietario.setEmail("carlos@example.com");
        propietario.setNumeroCelular("3109876543");

        propietario.setVehiculoAsociado(vehiculoCarga);
        System.out.println("Asociado creado: " + propietario.getNombre() + " con vehículo de placa: " + vehiculoCarga.getPlaca());
    }

    private static void calcultarTotalPasajeros() {
        VehiculoTransporte bus1 = new VehiculoTransporte();
        bus1.setNumeroMaximoPasajeros(40);

        VehiculoTransporte bus2 = new VehiculoTransporte();
        bus2.setNumeroMaximoPasajeros(30);

        List<VehiculoTransporte> vehiculos = new ArrayList<>();
        vehiculos.add(bus1);
        vehiculos.add(bus2);
        int[] viajesPorVehiculo = {5, 4};

        int totalPasajeros = calcularTotalPasajeros(vehiculos, viajesPorVehiculo);
        System.out.println("Total de pasajeros transportados en el día: " + totalPasajeros);
    }

    public static int calcularTotalPasajeros(List<VehiculoTransporte> vehiculos, int[] viajesPorVehiculo) {
        int totalPasajeros = 0;
        for (int i = 0; i < vehiculos.size(); i++) {
            totalPasajeros += vehiculos.get(i).getNumeroMaximoPasajeros() * viajesPorVehiculo[i];
        }
        return totalPasajeros;
    }
}