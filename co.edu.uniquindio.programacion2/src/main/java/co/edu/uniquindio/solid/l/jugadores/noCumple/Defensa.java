package co.edu.uniquindio.solid.l.jugadores.noCumple;

class Defensa implements Jugador {
    @Override
    public void entrenar() {
        System.out.println("El defensa está entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El defensa está jugando el partido.");
    }

    @Override
    public void cobrarTiroDeEsquina() {
        System.out.println("El defensa está cobrando el tiro de esquina.");
    }
}
