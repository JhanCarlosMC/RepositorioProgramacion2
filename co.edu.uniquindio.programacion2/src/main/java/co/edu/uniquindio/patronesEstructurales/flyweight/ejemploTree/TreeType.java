package co.edu.uniquindio.patronesEstructurales.flyweight.ejemploTree;

// Flyweight: Información compartida
class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing tree of type " + name + " at (" + x + ", " + y + ")");
    }
}
