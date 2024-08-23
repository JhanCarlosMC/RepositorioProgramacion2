package co.edu.uniquindio.solid.d.ejercicio2.old;

public class AccesoADatos2 {
    private Conexion conexion;

    public AccesoADatos2(Conexion conexion){
        this.conexion = conexion;
    }

    Dato getDatos(){
        return conexion.getDatos();
    }
}
