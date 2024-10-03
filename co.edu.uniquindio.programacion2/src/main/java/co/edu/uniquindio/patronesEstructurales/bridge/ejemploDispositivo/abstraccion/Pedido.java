package co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo.abstraccion;

import co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo.implementacion.ISistemaPago;

// Abstracción: Pedido que usa un sistema de pago
public abstract class Pedido {
    protected ISistemaPago sistemaPago;

    public Pedido(ISistemaPago sistemaPago) {
        this.sistemaPago = sistemaPago;
    }

    public abstract void realizarPago(double monto);
}