package co.edu.uniquindio.solid.d.ejercicio1.cumple;

class ImpresoraInyeccion implements Impresora {
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Imprimiendo en impresora de inyección: " + documento);
    }
}
