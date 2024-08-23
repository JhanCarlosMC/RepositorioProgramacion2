package co.edu.uniquindio.solid.o.ejercicio1.noCumple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Coche("Renault"));
        listaCoches.add( new Coche("Audi"));
        imprimirPrecioMedioCoche(listaCoches);
    }

    public static void imprimirPrecioMedioCoche(List<Coche> listaCoches){
        for (Coche coche : listaCoches) {
            if(coche.marca.equals("Renault")) System.out.println(18000);
            if(coche.marca.equals("Audi")) System.out.println(25000);
        }
    }
}
