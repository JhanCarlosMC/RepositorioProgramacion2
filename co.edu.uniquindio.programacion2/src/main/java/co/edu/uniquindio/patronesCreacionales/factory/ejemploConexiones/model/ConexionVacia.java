package co.edu.uniquindio.patronesCreacionales.factory.ejemploConexiones.model;

import co.edu.uniquindio.patronesCreacionales.factory.ejemploConexiones.services.IConexion;

public class ConexionVacia implements IConexion{

    @Override
    public void conectar() {
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }

    @Override
    public void desconectar() {
        System.out.println("NO SE ESPECIFICÓ PROVEEDOR");
    }

}
