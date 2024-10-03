package co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo;

import co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo.abstraccion.Pedido;
import co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo.abstraccion.PedidoDigital;
import co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo.abstraccion.PedidoFisico;
import co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo.implementacion.ISistemaPago;
import co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo.implementacion.PagoPaypal;
import co.edu.uniquindio.patronesEstructurales.bridge.ejemploDispositivo.implementacion.PagoTarjeta;

public class MainBridge {
    // Uso del patrón Bridge
    public static void main(String[] args) {
        ISistemaPago pagoTarjeta = new PagoTarjeta();
        Pedido pedidoFisico = new PedidoFisico(pagoTarjeta);
        pedidoFisico.realizarPago(100.0);

        ISistemaPago pagoConPayPal = new PagoPaypal();
        Pedido pedidoDigital = new PedidoDigital(pagoConPayPal);
        pedidoDigital.realizarPago(50.0);
    }

}
