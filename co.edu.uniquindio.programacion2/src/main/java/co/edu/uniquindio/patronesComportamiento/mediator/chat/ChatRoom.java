package co.edu.uniquindio.patronesComportamiento.mediator.chat;

import java.util.ArrayList;
import java.util.List;

// Implementación concreta del Mediator
public class ChatRoom implements ChatMediator {
  private List<User> users = new ArrayList<>();

  @Override
  public void addUser(User user) {
    users.add(user);
  }

  @Override
  public void sendMessage(String message, User user) {
    for (User u : users) {
      // El usuario no debe recibir su propio mensaje
      if (u != user) {
        u.receive(message);
      }
    }
  }
}
