package co.edu.uniquindio.patronesEstructurales.decorator.ejemploCuentaBancaria;

// Componente concreto
public class CuentaCorriente implements ICuentaBancaria {
    @Override
    public void abrirCuenta() {
        System.out.println("Cuenta corriente abierta.");
    }
}