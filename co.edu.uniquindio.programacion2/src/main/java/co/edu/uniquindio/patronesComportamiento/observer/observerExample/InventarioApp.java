package co.edu.uniquindio.patronesComportamiento.observer.observerExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventarioApp {
    public static void main(String[] args) {
        Producto producto = new Producto();

        // Crear observadores (clientes) que recibirán notificaciones
        ClienteObserver cliente1 = new ClienteObserver(producto);
        ClienteObserver cliente2 = new ClienteObserver(producto);

        // Crear ventana para modificar el stock
        JFrame frame = new JFrame("Administrar Inventario");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Cambiar Stock:");
        JTextField stockField = new JTextField(10);
        JButton updateButton = new JButton("Actualizar Stock");

        frame.add(label);
        frame.add(stockField);
        frame.add(updateButton);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int nuevoStock = Integer.parseInt(stockField.getText());
                    producto.setStock(nuevoStock);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor ingrese un número válido.");
                }
            }
        });

        frame.setVisible(true);
    }
}