package co.edu.uniquindio.patronesComportamiento.mediator.chat;

// Implementación concreta de User
public class ConcreteUser extends User {
  public ConcreteUser(ChatMediator mediator, String name) {
    super(mediator, name);
  }

  @Override
  public void send(String message) {
    System.out.println(name + " sends: " + message);
    mediator.sendMessage(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println(name + " receives: " + message);
  }
}
