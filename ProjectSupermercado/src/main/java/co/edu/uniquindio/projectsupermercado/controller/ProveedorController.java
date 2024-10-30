package co.edu.uniquindio.projectsupermercado.controller;

import co.edu.uniquindio.projectsupermercado.factory.ModelFactory;
import co.edu.uniquindio.projectsupermercado.mapping.dto.ProveedorDto;
import co.edu.uniquindio.projectsupermercado.service.IProveedorController;

public class ProveedorController implements IProveedorController {
  ModelFactory modelFactory;

  public ProveedorController() {
    modelFactory = ModelFactory.getInstance();
  }

  @Override
  public boolean crearProveedor(ProveedorDto proveedorDto) {
    return modelFactory.crearProveedor(proveedorDto);
  }
}
