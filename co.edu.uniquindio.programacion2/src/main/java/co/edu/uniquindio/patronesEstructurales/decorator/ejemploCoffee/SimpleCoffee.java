package co.edu.uniquindio.patronesEstructurales.decorator.ejemploCoffee;

// Objeto concreto
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
