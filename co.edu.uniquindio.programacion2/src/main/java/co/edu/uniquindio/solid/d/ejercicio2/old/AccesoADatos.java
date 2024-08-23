package co.edu.uniquindio.solid.d.ejercicio2.old;

public class AccesoADatos {
    private DatabaseService databaseService;

    public AccesoADatos(DatabaseService databaseService){
        this.databaseService = databaseService;
    }

    Dato getDatos(){
        return databaseService.getDatos();
    }
}
