package co.edu.uniquindio.patronesEstructurales.facade.ejemploScreenSound;

// Uso del patrón Facade
public class MainFacade {

//    HomeTheaterFacade simplifica la interacción con el complejo sistema
//    de cine en casa (pantalla, sonido, luces)
//    proporcionando una interfaz fácil de usar.
    public static void main(String[] args) {
        Screen screen = new Screen();
        SoundSystem sound = new SoundSystem();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(screen, sound, lights);
        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}
