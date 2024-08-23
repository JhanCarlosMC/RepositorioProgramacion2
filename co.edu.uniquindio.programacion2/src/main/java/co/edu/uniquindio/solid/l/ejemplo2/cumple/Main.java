package co.edu.uniquindio.solid.l.ejemplo2.cumple;


import co.edu.uniquindio.solid.l.ejemplo2.noCumple.Audi;
import co.edu.uniquindio.solid.l.ejemplo2.noCumple.Coche;
import co.edu.uniquindio.solid.l.ejemplo2.noCumple.Mazda;
import co.edu.uniquindio.solid.l.ejemplo2.noCumple.Mercedes;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Mazda());
        listaCoches.add( new Audi());
        listaCoches.add( new Mercedes());
        listaCoches.add(new Mazda());
        imprimirNumAsientos(listaCoches);
    }

    public static void imprimirNumAsientos(List<Coche> listaCoches ){
        for (Coche coche : listaCoches) {
            System.out.println(coche.numAsientos());
        }
    }
}
