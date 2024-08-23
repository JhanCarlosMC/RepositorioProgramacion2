package co.edu.uniquindio.solid.l.centroImpresion.noCumple;

public class Main {
    public static void main(String[] args) {
        Impresora impresoraLaser = new ImpresoraLaser();
        CentroImpresion centroImpresion = new CentroImpresion(impresoraLaser);
        centroImpresion.imprimir("Documento1.pdf");  // Salida: Imprimiendo en impresora láser: Documento1.pdf

        Impresora impresoraVirtual = new ImpresoraVirtual();
        centroImpresion = new CentroImpresion(impresoraVirtual);
        centroImpresion.imprimir("Documento2.pdf");  // Error: UnsupportedOperationException
    }
}
