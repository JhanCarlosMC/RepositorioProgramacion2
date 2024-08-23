package co.edu.uniquindio.solid.l.centroImpresion.noCumple;

class ImpresoraLaser implements Impresora {
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Imprimiendo en impresora láser: " + documento);
    }
}

