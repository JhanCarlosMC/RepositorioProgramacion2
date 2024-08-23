package co.edu.uniquindio.solid.l.ejemplo1.cumple;

public class Main {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        ejecutarMovimeinto(vehiculo);

        Vehiculo deportivo = new CocheDeportivo();
        ejecutarMovimeinto(deportivo);
    }

    private static void ejecutarMovimeinto(Vehiculo vehiculo) {
        vehiculo.mover();
    }
}
