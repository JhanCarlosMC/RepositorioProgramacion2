package co.edu.uniquindio.solid.l.jugadores.noCumple;

public interface Jugador {
    void entrenar();
    void jugarPartido();
    void cobrarTiroDeEsquina(); // No todos los jugadores pueden cobrar tiros de esquina
}
