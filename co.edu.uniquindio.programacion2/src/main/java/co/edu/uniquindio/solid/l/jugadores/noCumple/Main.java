package co.edu.uniquindio.solid.l.jugadores.noCumple;

public class Main {
    public static void main(String[] args) {
        Jugador delantero = new Delantero();
        delantero.entrenar();
        delantero.jugarPartido();
        delantero.cobrarTiroDeEsquina();

        Jugador portero = new Portero();
        portero.entrenar();
        portero.jugarPartido();
        portero.cobrarTiroDeEsquina();
    }
}
