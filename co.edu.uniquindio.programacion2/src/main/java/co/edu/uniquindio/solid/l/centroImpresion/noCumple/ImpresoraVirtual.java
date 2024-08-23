package co.edu.uniquindio.solid.l.centroImpresion.noCumple;

class ImpresoraVirtual implements Impresora {
    @Override
    public void imprimirDocumento(String documento) {
        throw new UnsupportedOperationException("Impresión virtual no soportada.");
    }
}
