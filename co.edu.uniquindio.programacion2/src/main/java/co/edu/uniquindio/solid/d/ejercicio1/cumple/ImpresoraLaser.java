package co.edu.uniquindio.solid.d.ejercicio1.cumple;

class ImpresoraLaser implements Impresora {
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Imprimiendo en impresora láser: " + documento);
    }
}
