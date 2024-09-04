package co.edu.uniquindio.patronesCreacionales.factory.ejemploConexiones;


import co.edu.uniquindio.patronesCreacionales.factory.ejemploConexiones.services.IConexion;

public class Main {

    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();

        IConexion cx1 = fabrica.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconectar();

        IConexion cx2 = fabrica.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconectar();

        IConexion cx3 = fabrica.getConexion("H2");
        cx3.conectar();
        cx3.desconectar();
    }
}
