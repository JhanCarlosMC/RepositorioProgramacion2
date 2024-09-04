package co.edu.uniquindio.patronesCreacionales.prototype.ejemploFiguras;

import co.edu.uniquindio.patronesCreacionales.prototype.ejemploFiguras.model.Circulo;

public class MainFiguras {
    public static void main(String[] args) {
        //Instancias originales
        Circulo circuloRojo = new Circulo(5, "Rojo");
        Circulo circuloVerde = new Circulo(6, "Verde");

        //Prototype
        Circulo circuloClonado = (Circulo) circuloRojo.clone();

        System.out.println(circuloRojo);
        System.out.println(circuloVerde);
        System.out.println(circuloClonado);
    }
}
