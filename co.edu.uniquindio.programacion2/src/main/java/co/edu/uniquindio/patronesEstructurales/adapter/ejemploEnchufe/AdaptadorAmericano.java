package co.edu.uniquindio.patronesEstructurales.adapter.ejemploEnchufe;

public class AdaptadorAmericano implements EnchufeAmericano{
    private EnchufeEuropeo enchufeEuropeo;

    public AdaptadorAmericano(EnchufeEuropeo enchufeEuropeo) {
        this.enchufeEuropeo = enchufeEuropeo;
    }

    @Override
    public void conectar() {
        enchufeEuropeo.enchufar();
    }
}
