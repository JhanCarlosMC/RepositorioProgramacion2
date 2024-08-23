package co.edu.uniquindio.solid.l.centroImpresion.cumple;

class ImpresoraVirtual implements Impresora {
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Simulando la impresión de: " + documento);
    }
}
