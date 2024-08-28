package co.edu.uniquindio.patronesCreacionales.builder.ejemploHouse.model;

public class HouseBuilder {
    protected String foundation;
    protected String structure;
    protected String roof;
    protected int windows;
    protected int doors;
    protected boolean garage;
    protected boolean garden;
    protected boolean swimmingPool;

    public HouseBuilder foundation(String foundation) {
        this.foundation = foundation;
        return this;// Devuelve la instancia actual de ClienteBuilder
    }

    public HouseBuilder structure(String structure) {
        this.structure = structure;
        return this; // Devuelve la instancia actual de HouseBuilder
    }

    public HouseBuilder roof(String roof) {
        this.roof = roof;
        return this; // Devuelve la instancia actual de HouseBuilder
    }

    public HouseBuilder windows(int windows) {
        this.windows = windows;
        return this; // Devuelve la instancia actual de HouseBuilder
    }

    public HouseBuilder doors(int doors) {
        this.doors = doors;
        return this; // Devuelve la instancia actual de HouseBuilder
    }

    public HouseBuilder garage(boolean garage) {
        this.garage = garage;
        return this; // Devuelve la instancia actual de HouseBuilder
    }

    public HouseBuilder garden(boolean garden) {
        this.garden = garden;
        return this; // Devuelve la instancia actual de HouseBuilder
    }

    public HouseBuilder swimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this; // Devuelve la instancia actual de HouseBuilder
    }

    public House build() {
        return new House(foundation, structure, roof, windows, doors, garage,garden, swimmingPool); // Construye y devuelve el objeto House
    }
}
