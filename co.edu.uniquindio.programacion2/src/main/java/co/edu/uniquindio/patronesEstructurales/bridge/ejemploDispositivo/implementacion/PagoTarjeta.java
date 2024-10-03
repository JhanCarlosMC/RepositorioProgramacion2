package co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo.implementacion;

public class PagoTarjeta implements ISistemaPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de " + monto + " procesado con Tarjeta.");
    }
}