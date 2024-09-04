package co.edu.uniquindio.patronesCreacionales.prototype.ejemploCuenta.model;

import co.edu.uniquindio.patronesCreacionales.prototype.ejemploCuenta.services.IPrototypeCuenta;

import java.io.Serializable;

public class CuentaAH implements IPrototypeCuenta{

    private String tipo;
    private double monto;

    public CuentaAH() {
        tipo = "AHORRO";
    }

    @Override
    public IPrototypeCuenta clone() {
        CuentaAH cuenta = null;

        try {
            cuenta  = (CuentaAH) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cuenta;
    }

    @Override
    public String toString() {
        return "CuentaAH [tipo=" + tipo + ", monto=" + monto + "]";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
