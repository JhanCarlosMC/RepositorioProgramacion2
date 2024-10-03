package co.edu.uniquindio.patronesEstructurales.proxy.ejemploDocumento;

// Documento real que puede ser costoso cargar
public class DocumentoReal implements IDocumento {
    private String nombreArchivo;

    public DocumentoReal(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        cargarDesdeDisco();
    }

    private void cargarDesdeDisco() {
        System.out.println("Cargando documento " + nombreArchivo + " desde el disco.");
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando documento " + nombreArchivo);
    }
}