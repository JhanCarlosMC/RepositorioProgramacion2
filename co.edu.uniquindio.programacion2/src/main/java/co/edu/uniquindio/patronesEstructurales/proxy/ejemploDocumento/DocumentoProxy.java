package co.edu.uniquindio.patronesEstructurales.proxy.ejemploDocumento;

public class DocumentoProxy implements IDocumento {
    private DocumentoReal documentoReal;
    private String nombreArchivo;

    public DocumentoProxy(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void mostrar() {
        if (documentoReal == null) {
            documentoReal = new DocumentoReal(nombreArchivo);  // Cargar solo cuando sea necesario
        }
        documentoReal.mostrar();
    }
}