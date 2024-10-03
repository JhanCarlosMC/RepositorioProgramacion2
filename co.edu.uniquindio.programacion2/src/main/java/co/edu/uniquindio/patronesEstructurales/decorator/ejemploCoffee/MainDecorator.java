package co.edu.uniquindio.patronesEstructurales.decorator.ejemploCoffee;

// Uso del patrón Decorator
public class MainDecorator {

//    Los decoradores como MilkDecorator y SugarDecorator añaden
//    funcionalidad extra (leche, azúcar) a un objeto Coffee sin modificar sus clases.
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}