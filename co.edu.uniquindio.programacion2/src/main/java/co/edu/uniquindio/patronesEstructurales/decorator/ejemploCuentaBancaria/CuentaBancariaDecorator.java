package co.edu.uniquindio.patronesEstructurales.decorator.ejemploCuentaBancaria;

abstract class CuentaBancariaDecorator implements ICuentaBancaria {
    protected ICuentaBancaria cuentaBancaria;

    public CuentaBancariaDecorator(ICuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void abrirCuenta() {
        this.cuentaBancaria.abrirCuenta();
    }
}