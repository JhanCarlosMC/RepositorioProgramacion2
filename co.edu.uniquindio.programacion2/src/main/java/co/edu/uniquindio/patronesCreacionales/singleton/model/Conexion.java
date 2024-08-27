package co.edu.uniquindio.patronesCreacionales.singleton.model;

public class Conexion {

    private static Conexion instancia;
    //private static Conexion instancia = new Conexion();

    //Para evitar instancia mediante el operador NEW
    private Conexion() {
    }

    //Para obtener la instancia unicamente por medio de este metodo
    //Note la palabra "static" que hace posible el acceso mediante Clase.Metodo
    public static Conexion getInstance(){
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
