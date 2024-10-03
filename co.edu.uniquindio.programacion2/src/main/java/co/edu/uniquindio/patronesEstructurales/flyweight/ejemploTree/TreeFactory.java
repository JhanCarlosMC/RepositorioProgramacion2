package co.edu.uniquindio.patronesEstructurales.flyweight.ejemploTree;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType type = treeTypes.get(name);
        if (type == null) {
            type = new TreeType(name, color, texture);
            treeTypes.put(name, type);
        }
        return type;
    }
}
