package co.edu.uniquindio.patronesEstructurales.facade.ejemploReserva;

public class SistemaVuelos {
    public void buscarVuelos(String origen, String destino) {
        System.out.println("Buscando vuelos desde " + origen + " hacia " + destino);
    }

    public void reservarVuelo() {
        System.out.println("Vuelo reservado.");
    }
}
