package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;

public class ModelFactory {
    private static ModelFactory instance;
    private static EmpresaTransporte empresaTransporte;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    public String calcularTotalPasajeros(String placa) {
        return empresaTransporte.calcularTotalPasajeros(placa);
    }

    /**
     * Inicializa los datos de la empresa de transporte, incluyendo propietarios, vehículos y usuarios.
     *
     * @return una instancia de EmpresaTransporte con datos predefinidos.
     */
    private static void inicializarDatos() {
        empresaTransporte = new EmpresaTransporte();
        empresaTransporte.setNombre("Transportes SA");

        // Propietarios
        Propietario propietario1 = new Propietario();
        propietario1.setNombre("Pedro");
        propietario1.setEdad(45);
        propietario1.setCedula("123456789");
        propietario1.setEmail("pedro@example.com");
        propietario1.setNumeroCelular("3001234567");

        Propietario propietario2 = new Propietario();
        propietario2.setNombre("Ana");
        propietario2.setEdad(42);
        propietario2.setCedula("987654321");
        propietario2.setEmail("ana@example.com");
        propietario2.setNumeroCelular("3109876543");

        Propietario propietario3 = new Propietario();
        propietario3.setNombre("Luis");
        propietario3.setEdad(50);
        propietario3.setCedula("456789123");
        propietario3.setEmail("luis@example.com");
        propietario3.setNumeroCelular("3204567891");

        Propietario propietario4 = new Propietario();
        propietario4.setNombre("Marta");
        propietario4.setEdad(38);
        propietario4.setCedula("654321987");
        propietario4.setEmail("marta@example.com");
        propietario4.setNumeroCelular("3016543219");

        // Vehículos de Carga
        VehiculoCarga vehiculoCarga1 = new VehiculoCarga();
        vehiculoCarga1.setPlaca("RRD098");
        vehiculoCarga1.setNumeroEjes(5);
        vehiculoCarga1.setCapacidadCarga(10000);
        vehiculoCarga1.setColor("Blanco");
        vehiculoCarga1.setMarca("Volvo");
        vehiculoCarga1.setModelo("FH16");

        VehiculoCarga vehiculoCarga2 = new VehiculoCarga();
        vehiculoCarga2.setPlaca("XXX096");
        vehiculoCarga2.setNumeroEjes(3);
        vehiculoCarga2.setCapacidadCarga(7500);
        vehiculoCarga2.setColor("Rojo");
        vehiculoCarga2.setMarca("Mercedes");
        vehiculoCarga2.setModelo("Actros");

        VehiculoCarga vehiculoCarga3 = new VehiculoCarga();
        vehiculoCarga3.setPlaca("77X096");
        vehiculoCarga3.setNumeroEjes(5);
        vehiculoCarga3.setCapacidadCarga(12000);
        vehiculoCarga3.setColor("Azul");
        vehiculoCarga3.setMarca("Scania");
        vehiculoCarga3.setModelo("R500");

        VehiculoCarga vehiculoCarga4 = new VehiculoCarga();
        vehiculoCarga4.setPlaca("ZZZ123");
        vehiculoCarga4.setNumeroEjes(4);
        vehiculoCarga4.setCapacidadCarga(9500);
        vehiculoCarga4.setColor("Negro");
        vehiculoCarga4.setMarca("Mack");
        vehiculoCarga4.setModelo("Anthem");

        // Vehículos de Transporte
        VehiculoTransporte vehiculoTransporte1 = new VehiculoTransporte();
        vehiculoTransporte1.setPlaca("AAA111");
        vehiculoTransporte1.setNumeroMaximoPasajeros(50);
        vehiculoTransporte1.setColor("Blanco");
        vehiculoTransporte1.setMarca("Mercedes");
        vehiculoTransporte1.setModelo("Sprinter");

        VehiculoTransporte vehiculoTransporte2 = new VehiculoTransporte();
        vehiculoTransporte2.setPlaca("BBB222");
        vehiculoTransporte2.setNumeroMaximoPasajeros(30);
        vehiculoTransporte2.setColor("Azul");
        vehiculoTransporte2.setMarca("Volkswagen");
        vehiculoTransporte2.setModelo("Crafter");

        VehiculoTransporte vehiculoTransporte3 = new VehiculoTransporte();
        vehiculoTransporte3.setPlaca("CCC333");
        vehiculoTransporte3.setNumeroMaximoPasajeros(40);
        vehiculoTransporte3.setColor("Rojo");
        vehiculoTransporte3.setMarca("Ford");
        vehiculoTransporte3.setModelo("Transit");

        VehiculoTransporte vehiculoTransporte4 = new VehiculoTransporte();
        vehiculoTransporte4.setPlaca("DDD444");
        vehiculoTransporte4.setNumeroMaximoPasajeros(60);
        vehiculoTransporte4.setColor("Verde");
        vehiculoTransporte4.setMarca("Toyota");
        vehiculoTransporte4.setModelo("Coaster");

        // Usuarios
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Carlos");
        usuario1.setEdad(25);
        usuario1.setVehiculoAsociado(vehiculoTransporte1);

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Lucía");
        usuario2.setEdad(30);
        usuario2.setVehiculoAsociado(vehiculoTransporte1);

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("Jorge");
        usuario3.setEdad(35);
        usuario3.setVehiculoAsociado(vehiculoTransporte2);

        Usuario usuario4 = new Usuario();
        usuario4.setNombre("Sofía");
        usuario4.setEdad(28);
        usuario4.setVehiculoAsociado(vehiculoTransporte3);

        Usuario usuario5 = new Usuario();
        usuario5.setNombre("Miguel");
        usuario5.setEdad(40);
        usuario5.setVehiculoAsociado(vehiculoTransporte4);

        // Asignación de usuarios a vehículos de transporte
        vehiculoTransporte1.setUsuarioToList(usuario1);
        vehiculoTransporte1.setUsuarioToList(usuario2);
        vehiculoTransporte2.setUsuarioToList(usuario3);
        vehiculoTransporte3.setUsuarioToList(usuario4);
        vehiculoTransporte4.setUsuarioToList(usuario5);

        // Asignación de vehículos a propietarios
        propietario1.setVehiculoAsociado(vehiculoCarga1);
        propietario1.getListaVehiculosAsociados().add(vehiculoCarga2);

        propietario2.setVehiculoAsociado(vehiculoCarga2);
        propietario2.getListaVehiculosAsociados().add(vehiculoCarga3);

        propietario3.setVehiculoAsociado(vehiculoCarga3);
        propietario3.getListaVehiculosAsociados().add(vehiculoCarga4);

        propietario4.setVehiculoAsociado(vehiculoCarga4);
        propietario4.getListaVehiculosAsociados().add(vehiculoCarga1);

        // Asignación en EmpresaTransporte
        empresaTransporte.getListaAsociados().add(propietario1);
        empresaTransporte.getListaAsociados().add(propietario2);
        empresaTransporte.getListaAsociados().add(propietario3);
        empresaTransporte.getListaAsociados().add(propietario4);

        empresaTransporte.getListVehiculosCarga().add(vehiculoCarga1);
        empresaTransporte.getListVehiculosCarga().add(vehiculoCarga2);
        empresaTransporte.getListVehiculosCarga().add(vehiculoCarga3);
        empresaTransporte.getListVehiculosCarga().add(vehiculoCarga4);

        empresaTransporte.setVehiculoTransporteToList(vehiculoTransporte1);
        empresaTransporte.setVehiculoTransporteToList(vehiculoTransporte2);
        empresaTransporte.setVehiculoTransporteToList(vehiculoTransporte3);
        empresaTransporte.setVehiculoTransporteToList(vehiculoTransporte4);

        empresaTransporte.setUsuarioToList(usuario1);
        empresaTransporte.setUsuarioToList(usuario2);
        empresaTransporte.setUsuarioToList(usuario3);
        empresaTransporte.setUsuarioToList(usuario4);
        empresaTransporte.setUsuarioToList(usuario5);
    }

}
