package co.edu.uniquindio.patronesEstructurales.adapter.ejemploEnchufe;

public class MainAdapter {
    public static void main(String[] args) {
        EnchufeEuropeo enchufeEuropeo = new EnchufeEuropeo();
        EnchufeAmericano adaptador = new AdaptadorAmericano(enchufeEuropeo);
        adaptador.conectar();  // Salida: "Enchufe europeo conectado."
    }
}
