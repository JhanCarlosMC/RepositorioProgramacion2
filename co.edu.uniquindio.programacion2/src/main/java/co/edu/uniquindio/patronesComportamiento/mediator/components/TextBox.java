package co.edu.uniquindio.patronesComportamiento.mediator.components;

public class TextBox extends Component {
  public TextBox(Mediator mediator) {
    super(mediator);
  }

  public void setText(String text) {
    System.out.println("TextBox: " + text);
  }
}
