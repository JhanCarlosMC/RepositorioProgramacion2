package co.edu.uniquindio.solid.l.jugadores.cumple;

public class Main {
    public static void main(String[] args) {
        Jugador delantero = new Delantero();
        delantero.entrenar();
        delantero.jugarPartido();

        EspecialistaEnEsquinas especialista = (EspecialistaEnEsquinas) delantero;
        especialista.cobrarTiroDeEsquina();  // Salida: El delantero está cobrando el tiro de esquina.

        Jugador portero = new Portero();
        portero.entrenar();
        portero.jugarPartido();

        // Portero no implementa EspecialistaEnEsquinas, por lo que no puede cobrar tiros de esquina
        // No se debería hacer casting a EspecialistaEnEsquinas, ya que no lo implementa
    }
}
