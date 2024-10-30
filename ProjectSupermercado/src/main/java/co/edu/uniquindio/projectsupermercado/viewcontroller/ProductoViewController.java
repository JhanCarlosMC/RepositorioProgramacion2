package co.edu.uniquindio.projectsupermercado.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.projectsupermercado.controller.ProductoController;
import co.edu.uniquindio.projectsupermercado.controller.ProveedorController;
import co.edu.uniquindio.projectsupermercado.mapping.dto.ProductoDto;
import co.edu.uniquindio.projectsupermercado.mapping.dto.ProveedorDto;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ProductoViewController {
  ProveedorController proveedorController;
  ProductoController productoController;
  ObservableList<ProductoDto> listProductosDto = FXCollections.observableArrayList();
  ProductoDto selectedProducto;

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button btnActualizar;

  @FXML
  private Button btnAgregarProducto;

  @FXML
  private Button btnEliminarProducto;

  @FXML
  private Button btnLimpiarSeleccion;

  @FXML
  private Button btnProxy;

  @FXML
  private TableView<ProductoDto> tableProducto;

  @FXML
  private TableColumn<ProductoDto, Integer> tcCantidad;

  @FXML
  private TableColumn<ProductoDto, String> tcId;

  @FXML
  private TableColumn<ProductoDto, String> tcNombre;

  @FXML
  private TableColumn<ProductoDto, Double> tcPrecio;

  @FXML
  private TextField txtCantDisponible;

  @FXML
  private TextField txtId;

  @FXML
  private TextField txtNombre;

  @FXML
  private TextField txtPrecio;

  @FXML
  void onActualizarProducto(ActionEvent event) {
    actualizarProducto();
  }

  @FXML
  void onAgregarProducto(ActionEvent event) {
    agregarProducto();
  }

  @FXML
  void onEliminarProducto(ActionEvent event) {
    eliminarProducto();
  }

  @FXML
  void onLimpiarSeleccion(ActionEvent event) {
    limpiarSeleccion();
  }

  @FXML
  void onProxyAction(ActionEvent event) {
    implementacionProxy();
  }

  @FXML
  void initialize() {
    productoController = new ProductoController();
    proveedorController = new ProveedorController();

    initView();
  }

  private void initView() {
    initDataBinding();
    obtenerProductos();
    tableProducto.getItems().clear();
    tableProducto.setItems(listProductosDto);

    listenerSelection();
  }

  private void initDataBinding() {
    tcId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().idProducto()));
    tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombre()));
    // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    tcPrecio.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().precio()));
    tcCantidad.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().cantDisponible()));
  }

  private void obtenerProductos() {
    listProductosDto.addAll(productoController.getProductosDto());
  }

  private void listenerSelection() {
    tableProducto.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
      selectedProducto = newSelection;
      mostrarInformacionProducto(selectedProducto);
    });
  }

  private void mostrarInformacionProducto(ProductoDto producto) {
    if (producto != null) {
      txtId.setText(producto.idProducto());
      txtNombre.setText(producto.nombre());
      txtPrecio.setText(String.valueOf(producto.precio()));
      txtCantDisponible.setText(String.valueOf(producto.cantDisponible()));
    }
  }

  private void agregarProducto() {
    ProductoDto newProductoDto = buildProductoDto();

    if (productoController.agregarProducto(newProductoDto)) {
      listProductosDto.add(newProductoDto);
      limpiarCamposProducto();
    }
  }

  private void actualizarProducto() {
  int cont = 0;

    for (ProductoDto productoDto : listProductosDto) {
      if (txtId.getText().equals(productoDto.idProducto())) {
        cont = cont + 1;
      }
    }

    if (selectedProducto != null &&
        productoController.actualizarProducto(selectedProducto.idProducto(), buildProductoDto()) && cont < 2) {

      int index = listProductosDto.indexOf(selectedProducto);
      if (index >= 0) {
        listProductosDto.set(index, buildProductoDto());
      }

      tableProducto.refresh();
      limpiarSeleccion();
      limpiarCamposProducto();
    }
  }

  private void eliminarProducto() {
    if (productoController.eliminarProducto(txtId.getText())) {

      listProductosDto.remove(selectedProducto);
      limpiarCamposProducto();
      limpiarSeleccion();
    }
  }

  private void implementacionProxy(){
    ProveedorDto newProveedorDto = new ProveedorDto(1, "Juan Miguel");

    proveedorController.crearProveedor(newProveedorDto);
  }

  private ProductoDto buildProductoDto() {
    return new ProductoDto(
        txtId.getText(),
        txtNombre.getText(),
        Double.parseDouble(txtPrecio.getText()),
        Integer.parseInt(txtCantDisponible.getText())
    );
  }

  private void limpiarCamposProducto() {
    txtId.clear();
    txtNombre.clear();
    txtPrecio.clear();
    txtCantDisponible.clear();
  }

  private void limpiarSeleccion() {
    tableProducto.getSelectionModel().clearSelection();
    limpiarCamposProducto();
  }


}