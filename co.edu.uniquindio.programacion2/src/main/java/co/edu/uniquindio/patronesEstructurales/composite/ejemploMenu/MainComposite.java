package co.edu.uniquindio.patronesEstructurales.composite.ejemploMenu;

// Uso del patrón Composite
public class MainComposite {

//    El Menu puede contener tanto MenuItem (objetos hoja)
//    como otros Menu (compuestos). Este patrón permite tratar ambos de manera uniforme.
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main Menu");
        MenuItem item1 = new MenuItem("Item 1");
        MenuItem item2 = new MenuItem("Item 2");

        Menu subMenu = new Menu("Sub Menu");
        subMenu.add(new MenuItem("Sub Item 1"));

        mainMenu.add(item1);
        mainMenu.add(item2);
        mainMenu.add(subMenu);

        mainMenu.show();
    }
}
