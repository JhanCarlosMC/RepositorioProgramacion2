package co.edu.uniquindio.patronesEstructurales.flyweight.ejemploTree;

// Contexto: Información no compartida
class Tree {
    private int weight;
    private int height;
    private TreeType type;

    public Tree(int weight, int height, TreeType type) {
        this.weight = weight;
        this.height = height;
        this.type = type;
    }

    public void draw() {
        type.draw(weight, height);
    }
}