package co.edu.uniquindio.patronesComportamiento.mediator.components;

public class ConcreteMediator implements Mediator{
  private Button button;
  private TextBox textBox;

  public void setButton(Button button) {
    this.button = button;
  }

  public void setTextBox(TextBox textBox) {
    this.textBox = textBox;
  }

  @Override
  public void notify(Component sender, String event) {
    if (sender == button && event.equals("click")) {
      textBox.setText("Button clicked");
    }
  }
}
