package co.edu.uniquindio.solid.l.jugadores.noCumple;

class Portero implements Jugador {
    @Override
    public void entrenar() {
        System.out.println("El portero está entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El portero está jugando el partido.");
    }

    @Override
    public void cobrarTiroDeEsquina() {
        throw new UnsupportedOperationException("El portero no puede cobrar tiros de esquina.");
    }
}
