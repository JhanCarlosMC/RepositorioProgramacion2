package co.edu.uniquindio.patronesComportamiento.mediator.components;

public class Button extends Component {
  public Button(Mediator mediator) {
    super(mediator);
  }

  public void click() {
    mediator.notify(this, "click");
  }
}
