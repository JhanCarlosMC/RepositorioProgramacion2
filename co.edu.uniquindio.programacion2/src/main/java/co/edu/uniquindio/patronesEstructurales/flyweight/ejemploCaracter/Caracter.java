package co.edu.uniquindio.patronesEstructurales.flyweight.ejemploCaracter;

// Flyweight: Estado compartido entre instancias
public class Caracter {
    private char simbolo;

    public Caracter(char simbolo) {
        this.simbolo = simbolo;
    }

    public void mostrar(int tamaño) {
        System.out.println("Carácter: " + simbolo + " tamaño: " + tamaño);
    }
}
