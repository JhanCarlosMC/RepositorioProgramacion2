package co.edu.uniquindio.patronesCreacionales.factory.ejemploFabricaVehiculos;

import co.edu.uniquindio.patronesCreacionales.factory.ejemploFabricaVehiculos.model.Camion;
import co.edu.uniquindio.patronesCreacionales.factory.ejemploFabricaVehiculos.model.Carro;
import co.edu.uniquindio.patronesCreacionales.factory.ejemploFabricaVehiculos.model.Moto;
import co.edu.uniquindio.patronesCreacionales.factory.ejemploFabricaVehiculos.services.IVehiculo;

public class FabricaVehiculo {
    /**
     * Método para crear un Vehiculo según el tipo especificado.
     *
     * @param tipoVehiculo Tipo de vehículo que se desea crear.
     * @return Una instancia de Vehiculo.
     */
    public IVehiculo crearVehiculo(String tipoVehiculo) {
        switch (tipoVehiculo.toLowerCase()) {
            case "carro":
                return new Carro();
            case "moto":
                return new Moto();
            case "camion":
                return new Camion();
            default:
                throw new IllegalArgumentException("Tipo de vehículo desconocido: " + tipoVehiculo);
        }
    }
}
