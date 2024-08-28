package co.edu.uniquindio.patronesCreacionales.builder.ejemploClienteHerencia;

import co.edu.uniquindio.patronesCreacionales.builder.ejemploClienteHerencia.model.*;
import co.edu.uniquindio.patronesCreacionales.builder.ejemploClienteHerencia.builder.*;


public class MainClienteHerencia {
    public static void main(String[] args) {
        ejemplo1();
    }

    private static void ejemplo1() {
        Cliente clienteBasico = new ClienteBuilder()
                .nombre("Juan Perez")
                .email("juan@example.com")
                .telefono("123456789")
                .build();

        ClientePremium clientePremium = new ClientePremiumBuilder()
                .nombre("Ana López")
                .email("ana@example.com")
                .telefono("987654321")
                .nivelDeMembresia("Oro")
                .build();

        ClienteVIP clienteVIP = new ClienteVIPBuilder()
                .nombre("Carlos Martínez")
                .email("carlos@example.com")
                .telefono("555555555")
                .asesorAsignado("Roberto Gómez")
                .build();
    }
}
