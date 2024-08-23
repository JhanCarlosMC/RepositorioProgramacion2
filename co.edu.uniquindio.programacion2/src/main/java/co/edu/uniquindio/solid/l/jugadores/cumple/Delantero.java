package co.edu.uniquindio.solid.l.jugadores.cumple;

class Delantero implements Jugador, EspecialistaEnEsquinas {
    @Override
    public void entrenar() {
        System.out.println("El delantero está entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El delantero está jugando el partido.");
    }

    @Override
    public void cobrarTiroDeEsquina() {
        System.out.println("El delantero está cobrando el tiro de esquina.");
    }
}
