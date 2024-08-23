package co.edu.uniquindio.solid.l.jugadores.cumple;

class Portero implements Jugador {
    @Override
    public void entrenar() {
        System.out.println("El portero está entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El portero está jugando el partido.");
    }

    // El portero no implementa EspecialistaEnEsquinas, por lo que no tiene este método
}
