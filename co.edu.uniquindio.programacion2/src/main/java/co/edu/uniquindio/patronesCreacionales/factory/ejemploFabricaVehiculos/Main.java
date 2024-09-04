package co.edu.uniquindio.patronesCreacionales.factory.ejemploFabricaVehiculos;

import co.edu.uniquindio.patronesCreacionales.factory.ejemploFabricaVehiculos.services.IVehiculo;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la fábrica de vehículos
        FabricaVehiculo fabrica = new FabricaVehiculo();

        // Crear un Coche usando la fábrica
        IVehiculo coche = fabrica.crearVehiculo("carro");
        coche.conducir();  // Salida: Conduciendo un coche.

        // Crear una Moto usando la fábrica
        IVehiculo moto = fabrica.crearVehiculo("moto");
        moto.conducir();  // Salida: Conduciendo una moto.

        // Crear un Camión usando la fábrica
        IVehiculo camion = fabrica.crearVehiculo("camion");
        camion.conducir();  // Salida: Conduciendo un camión.


    }
}
