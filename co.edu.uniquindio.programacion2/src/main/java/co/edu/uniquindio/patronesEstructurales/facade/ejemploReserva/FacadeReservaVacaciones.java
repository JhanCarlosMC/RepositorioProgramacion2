package co.edu.uniquindio.patronesEstructurales.facade.ejemploReserva;

public class FacadeReservaVacaciones {
    private SistemaVuelos vuelos;
    private SistemaHoteles hoteles;
    private SistemaAlquilerAutos autos;

    public FacadeReservaVacaciones() {
        vuelos = new SistemaVuelos();
        hoteles = new SistemaHoteles();
        autos = new SistemaAlquilerAutos();
    }

    public void buscarPaquete(String origen, String destino) {
        System.out.println("Buscando paquete vacacional completo...");
        vuelos.buscarVuelos(origen, destino);
        hoteles.buscarHoteles(destino);
        autos.buscarAutos(destino);
    }

    public void reservarPaquete() {
        System.out.println("Reservando paquete vacacional completo...");
        vuelos.reservarVuelo();
        hoteles.reservarHotel();
        autos.reservarAuto();
    }
}
