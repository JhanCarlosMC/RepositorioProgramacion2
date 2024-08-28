package co.edu.uniquindio.patronesCreacionales.builder.ejemploHouse.model;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private int windows;
    private int doors;
    private boolean garage;
    private boolean garden;
    private boolean swimmingPool;

    public House(String foundation, String structure, String roof, int windows, int doors, boolean garage, boolean garden, boolean swimmingPool) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.windows = windows;
        this.doors = doors;
        this.garage = garage;
        this.garden = garden;
        this.swimmingPool = swimmingPool;
    }

    public static HouseBuilder builder(){
        return new HouseBuilder();
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
}
