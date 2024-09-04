package co.edu.uniquindio.patronesCreacionales.prototype.ejemploCuenta;

import co.edu.uniquindio.patronesCreacionales.prototype.ejemploCuenta.model.CuentaAH;

public class Main {
    public static void main(String[] args) {
        //Nueva instancia
        CuentaAH cuentaAhorros = new CuentaAH();
        cuentaAhorros.setMonto(2000);

        //Prototype
        CuentaAH cuentaClonada = (CuentaAH) cuentaAhorros.clone();

        System.out.println(cuentaAhorros);
        System.out.println(cuentaClonada);

        System.out.println(cuentaAhorros == cuentaClonada);

    }
}
