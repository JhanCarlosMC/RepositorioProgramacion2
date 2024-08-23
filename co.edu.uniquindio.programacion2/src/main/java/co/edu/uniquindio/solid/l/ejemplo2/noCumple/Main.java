package co.edu.uniquindio.solid.l.ejemplo2.noCumple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Renault());
        listaCoches.add( new Audi());
        listaCoches.add( new Mercedes());
        listaCoches.add(new Mazda());
        imprimirNumAsientos(listaCoches);
    }

    public static void imprimirNumAsientos(List<Coche> listaCoches){
        for (Coche coche : listaCoches) {
            if(coche instanceof Renault){
                System.out.println(numAsientosRenault(coche));
            }
            if(coche instanceof Audi){
                System.out.println(numAsientosAudi(coche));
            }
            if(coche instanceof Mercedes){
                System.out.println(numAsientosMercedes(coche));
            }
            if(coche instanceof Mazda){
                System.out.println(numAsientosMazda(coche));
            }
        }
    }

    private static int numAsientosMazda(Coche coche) {
        return coche.numAsientos();
    }

    private static int numAsientosMercedes(Coche coche) {
       return coche.numAsientos();
    }

    private static int numAsientosAudi(Coche coche) {
        return coche.numAsientos();
    }

    private static int numAsientosRenault(Coche coche) {
        return coche.numAsientos();
    }
}
