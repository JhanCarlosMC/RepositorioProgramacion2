package co.edu.uniquindio.solid.l.centroImpresion.cumple;

public class CentroImpresion {
    private Impresora impresora;

    public CentroImpresion(Impresora impresora) {
        this.impresora = impresora;
    }

    public void imprimir(String documento) {
        impresora.imprimirDocumento(documento);
    }
}