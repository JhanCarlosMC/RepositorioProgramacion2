package co.edu.uniquindio.solid.d.ejercicio2.nuevo;

public class AccesoADatos {
    Conexion conexion;

    public AccesoADatos(){

    }

    Dato getDatos(){
        return conexion.getDatos();
    }
}
