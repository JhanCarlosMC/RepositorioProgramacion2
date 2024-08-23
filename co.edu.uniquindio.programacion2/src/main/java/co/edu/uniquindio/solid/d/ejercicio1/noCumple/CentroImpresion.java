package co.edu.uniquindio.solid.d.ejercicio1.noCumple;

class CentroImpresion {
    private ImpresoraLaser impresoraLaser;
    private ImpresoraInyeccion impresoraInyeccion;

    public CentroImpresion() {
        this.impresoraLaser = new ImpresoraLaser();
        this.impresoraInyeccion = new ImpresoraInyeccion();
    }

    public void imprimir(String documento, String tipoImpresora) {
        if ("laser".equals(tipoImpresora)) {
            impresoraLaser.imprimirDocumento(documento);
        } else if ("inyeccion".equals(tipoImpresora)) {
            impresoraInyeccion.imprimirDocumento(documento);
        }
    }
}
