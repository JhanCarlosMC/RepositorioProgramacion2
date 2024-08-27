package co.edu.uniquindio.patronesCreacionales.builder.ejemploCliente;

import co.edu.uniquindio.patronesCreacionales.builder.ejemploCliente.model.Cliente;

public class MainCliente {
    public static void main(String[] args) {

    }

    private static void creacionCliente() {
        Cliente newCliente = Cliente.builder()
                .nombre("Jhan Carlos")
                .cedula("1001548665")
                .build();
    }

    Cliente newCliente2 = Cliente.builder()
            .nombre("Jhan Carlos")
            .apellido("Martinez")
            .cedula("1001548665")
            .email("jcmc@gmail.com")
            .numeroCelular("311546456")
            .direccion("la casa")
            .build();
}

