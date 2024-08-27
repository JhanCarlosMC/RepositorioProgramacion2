package co.edu.uniquindio.patronesCreacionales.singleton;

import co.edu.uniquindio.patronesCreacionales.singleton.model.Conexion;

public class MainSingleton {
    public static void main(String[] args) {
        testSingleton();
    }

    private static void testSingleton(){
        //instancia por contructor prohibido al ser definido "private
        //Conexion conexionSingleton =  new Conexion();
        Conexion conexionSingleton = Conexion.getInstance();

        boolean rpta = conexionSingleton != null;
        System.out.println(rpta);
    }
}
