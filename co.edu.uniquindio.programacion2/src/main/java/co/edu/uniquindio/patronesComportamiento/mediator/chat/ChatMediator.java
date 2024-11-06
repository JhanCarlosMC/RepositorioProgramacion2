package co.edu.uniquindio.patronesComportamiento.mediator.chat;

public interface ChatMediator {
  void sendMessage(String message, User user);
  void addUser(User user);
}
