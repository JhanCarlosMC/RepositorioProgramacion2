package co.edu.uniquindio.patronesCreacionales.factory.ejemploConexiones;


import co.edu.uniquindio.patronesCreacionales.factory.ejemploConexiones.model.*;
import co.edu.uniquindio.patronesCreacionales.factory.ejemploConexiones.services.IConexion;


public class ConexionFabrica {

    public IConexion getConexion(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQL();
        } else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        } else if (motor.equalsIgnoreCase("POSTGRE")) {
            return new ConexionPostgreSQL();
        } else if (motor.equalsIgnoreCase("SQL")) {
            return new ConexionSQLServer();
        }

        return new ConexionVacia();
    }
}
