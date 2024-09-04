package co.edu.uniquindio.patronesCreacionales.factory.ejemploFabricaVehiculos.model;

import co.edu.uniquindio.patronesCreacionales.factory.ejemploFabricaVehiculos.services.IVehiculo;

public class Camion implements IVehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un camion");
    }
}
