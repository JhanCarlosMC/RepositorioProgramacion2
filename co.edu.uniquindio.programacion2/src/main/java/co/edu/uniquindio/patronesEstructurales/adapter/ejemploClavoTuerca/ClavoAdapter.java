package co.edu.uniquindio.patronesEstructurales.adapter.ejemploClavoTuerca;

public class ClavoAdapter extends Tornillo{
private Clavo clavo;

    public ClavoAdapter(Clavo clavo) {
        this.clavo = clavo;
    }

    @Override
    public double getRadius() {
        return clavo.getWidth() * Math.sqrt(2)/2;
    }
}
