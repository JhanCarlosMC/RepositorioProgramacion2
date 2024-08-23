package co.edu.uniquindio.solid.d.ejercicio1.cumple;

class CentroImpresion {
    private Impresora impresora;

    public CentroImpresion(Impresora impresora) {
        this.impresora = impresora;
    }

    public void imprimir(String documento) {
        impresora.imprimirDocumento(documento);
    }
}