package co.edu.uniquindio.solid.o.ejercicio1.cumple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Renault());
        listaCoches.add( new Audi());
        listaCoches.add( new Mercedes());
        imprimirPrecioMedioCoche(listaCoches);
    }

    public static void imprimirPrecioMedioCoche(List<Coche> listaCoches){
        for (Coche coche : listaCoches) {
            System.out.println(coche.precioMedioCoche());
        }
    }
}
