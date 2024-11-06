package co.edu.uniquindio.patronesComportamiento.mediator.components;

public class MainMediator {
  public static void main(String[] args) {
    ConcreteMediator mediator = new ConcreteMediator();
    Button button = new Button(mediator);
    TextBox textBox = new TextBox(mediator);

    mediator.setButton(button);
    mediator.setTextBox(textBox);

    button.click();
  }
}
