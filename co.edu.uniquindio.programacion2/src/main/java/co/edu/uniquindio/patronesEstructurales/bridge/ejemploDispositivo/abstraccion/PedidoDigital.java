package co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo.abstraccion;

import co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo.implementacion.ISistemaPago;

// Implementación concreta: Pedido de producto digital
public class PedidoDigital extends Pedido {

    public PedidoDigital(ISistemaPago sistemaPago) {
        super(sistemaPago);
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Pedido de producto digital.");
        sistemaPago.procesarPago(monto);
    }
}