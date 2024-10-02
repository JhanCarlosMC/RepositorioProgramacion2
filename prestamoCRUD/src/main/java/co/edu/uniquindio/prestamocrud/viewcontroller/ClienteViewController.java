package co.edu.uniquindio.prestamocrud.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.prestamocrud.controller.ClienteController;
import co.edu.uniquindio.prestamocrud.mapping.dto.ClienteDto;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ClienteViewController {
    ClienteController clienteController;
    ObservableList<ClienteDto> listClientesDto = FXCollections.observableArrayList();
    ClienteDto selectedCliente;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminar;

    @FXML
    private TableView<ClienteDto> tableCliente;

    @FXML
    private TableColumn<ClienteDto, String> tcApellido;

    @FXML
    private TableColumn<ClienteDto, String> tcCedula;

    @FXML
    private TableColumn<ClienteDto, String> tcCorreo;

    @FXML
    private TableColumn<ClienteDto, String> tcDireccion;

    @FXML
    private TableColumn<ClienteDto, Integer> tcEdad;

    @FXML
    private TableColumn<ClienteDto, String> tcNombre;

    @FXML
    private TableColumn<ClienteDto, String> tcTelefono;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefonoCelular;

    @FXML
    void onActualizarCliente(ActionEvent event) {

    }

    @FXML
    void onAgregarCliente(ActionEvent event) {
        crearCliente();
    }

    @FXML
    void onEliminarCliente(ActionEvent event) {

    }

    @FXML
    void initialize() {
        clienteController = new ClienteController();

        initView();
    }

    private void initView() {
        initDataBinding();
        obtenerClientes();
        tableCliente.getItems().clear();
        tableCliente.setItems(listClientesDto);
        listenerSelection();
    }

    private void initDataBinding() {
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombre()));
        tcApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().apellido()));
        tcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().cedula()));
        tcCorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().email()));
        tcTelefono.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().telefonoCelular()));
        tcDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().direccion()));
    }

    private void obtenerClientes() {
        listClientesDto.addAll(clienteController.obtenerClientes());
    }

    private void listenerSelection() {
        tableCliente.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCliente = newSelection;
            mostrarInformacionCliente(selectedCliente);
        });
    }

    private void mostrarInformacionCliente(ClienteDto cliente) {
        if (cliente != null) {
            txtApellido.setText(cliente.apellido());
            txtCedula.setText(cliente.cedula());
            txtCorreo.setText(cliente.email());
            txtDireccion.setText(cliente.telefonoCelular());
            txtNombre.setText(cliente.nombre());
            txtTelefonoCelular.setText(cliente.telefonoCelular());
        }
    }

    private void crearCliente() {
        ClienteDto newClienteDto = buildClienteDto();

        if (clienteController.agregarCliente(newClienteDto)) {
            listClientesDto.add(newClienteDto);
            limpiarCamposCliente();
        }
    }

    private ClienteDto buildClienteDto() {
        return new ClienteDto(
                txtCedula.getText(),
                txtNombre.getText(),
                txtApellido.getText(),
                txtDireccion.getText(),
                txtTelefonoCelular.getText(),
                txtCorreo.getText()
        );
    }

    private void limpiarCamposCliente() {
        txtCedula.clear();
        txtNombre.clear();
        txtApellido.clear();
        txtDireccion.clear();
        txtTelefonoCelular.clear();
        txtCorreo.clear();

    }
}
