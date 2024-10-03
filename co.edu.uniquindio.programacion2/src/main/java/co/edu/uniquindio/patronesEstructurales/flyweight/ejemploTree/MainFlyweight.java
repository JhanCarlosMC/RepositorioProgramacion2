package co.edu.uniquindio.patronesEstructurales.flyweight.ejemploTree;

// Uso del patrón Flyweight - Optimiza el uso de memoria compartiendo instancias de objetos similares.
public class MainFlyweight {

//    TreeType es el flyweight que se comparte entre
//    múltiples árboles. Cada Tree tiene su propia posición,
//    pero el tipo de árbol (nombre, color, textura)
//    se comparte para ahorrar memoria.
    public static void main(String[] args) {
        TreeType oakType = TreeFactory.getTreeType("Oak", "Green", "Rough");
        Tree oakTree1 = new Tree(10, 20, oakType);
        Tree oakTree2 = new Tree(15, 25, oakType);

        oakTree1.draw();
        oakTree2.draw();
    }
}
