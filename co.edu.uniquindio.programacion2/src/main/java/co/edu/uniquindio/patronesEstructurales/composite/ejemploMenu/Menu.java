package co.edu.uniquindio.patronesEstructurales.composite.ejemploMenu;

import java.util.ArrayList;
import java.util.List;

// Compuesto
class Menu implements MenuComponent {
    private String name;
    private List<MenuComponent> items = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        items.add(component);
    }

    @Override
    public void show() {
        System.out.println("Menu: " + name);
        for (MenuComponent item : items) {
            item.show();
        }
    }
}
