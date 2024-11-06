package co.edu.uniquindio.patronesComportamiento.mediator.components;

public abstract class Component {
  protected Mediator mediator;

  public Component(Mediator mediator) {
    this.mediator = mediator;
  }
}
