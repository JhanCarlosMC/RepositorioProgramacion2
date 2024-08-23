package co.edu.uniquindio.empresaTransporte.model;

import co.edu.uniquindio.empresaTransporte.services.IVehiculoElectrico;

public class VehiculoPasajero extends Vehiculo implements IVehiculoElectrico {
    private int numeroMaximoPasajeros;

    public VehiculoPasajero() {
    }

    public VehiculoPasajero(String placa, String modelo, String marca, String color, int numeroMaximoPasajeros) {
        super(placa, modelo, marca, color);
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }

    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    @Override
    public void encender() {
        System.out.println("No me encendio......ayuda");
    }

    @Override
    public void encenderEletricamente() {
        System.out.println("Encender electricamente");
    }

}
