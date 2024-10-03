package co.edu.uniquindio.patronesEstructurales.decorator.ejemploCuentaBancaria;

// Uso del patrón Decorator - Añade dinámicamente funcionalidades a un objeto sin modificar su estructura original.
public class MainDecorator {

    public static void main(String[] args) {
        ICuentaBancaria cuenta = new CuentaCorriente();

        cuenta = new SeguroCuenta(cuenta);

        cuenta.abrirCuenta();  // Abre cuenta corriente y agrega seguro

    }
}
