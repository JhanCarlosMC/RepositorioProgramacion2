package co.edu.uniquindio.patronesEstructurales.proxy.ejemploDocumento;

        // Uso del patrón Proxy - Actúa como intermediario para controlar el acceso a otro objeto.
public class MainProxy {

    public static void main(String[] args) {
        IDocumento documento = new DocumentoProxy("archivo.pdf");

        // El documento solo se carga cuando se necesita mostrar
        documento.mostrar();  // Carga y muestra el documento
        documento.mostrar();  // Solo muestra el documento, sin recargar
    }
}
