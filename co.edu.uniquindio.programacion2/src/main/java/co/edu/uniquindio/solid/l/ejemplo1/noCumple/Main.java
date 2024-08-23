package co.edu.uniquindio.solid.l.ejemplo1.noCumple;

public class Main {

    public static void main(String[] args) {
        Vehiculo vehiculo = new CocheDeportivo();
        ejecutarMovimeinto(vehiculo);

        Vehiculo deportivo = new Vehiculo();
        ejecutarMovimeinto(deportivo);
    }

    private static void ejecutarMovimeinto(Vehiculo vehiculo) {
        vehiculo.mover();
    }
}
