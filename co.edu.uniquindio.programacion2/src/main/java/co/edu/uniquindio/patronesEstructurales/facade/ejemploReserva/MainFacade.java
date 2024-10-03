package co.edu.uniquindio.patronesEstructurales.facade.ejemploReserva;

// Uso del patrón Facade - Proporciona una interfaz simplificada a un sistema complejo.
public class MainFacade {

    public static void main(String[] args) {
        FacadeReservaVacaciones fachadaReservas = new FacadeReservaVacaciones();

        // El cliente solo interactúa con la fachada
        fachadaReservas.buscarPaquete("Madrid", "París");
        fachadaReservas.reservarPaquete();
    }
}
