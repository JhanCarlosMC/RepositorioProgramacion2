package co.edu.uniquindio.patronesEstructurales.adapter.ejemploClavoTuerca;

public class MainAdapter {
    // Uso del adaptador
    public static void main(String[] args) {
        Tuerca tuerca = new Tuerca(5);
        Clavo clavo = new Clavo(5);

        ClavoAdapter adapter = new ClavoAdapter(clavo);

        if (tuerca.enrroscar(adapter)){
            System.out.println("El clavo encaja en la tuerca");
        }else {
            System.out.println("No encaja");
        }
    }
}
