package co.edu.uniquindio.patronesComportamiento.mediator.chat;

public class MainMediator {

  public static void main(String[] args) {
    ChatMediator chatRoom = new ChatRoom();

    User user1 = new ConcreteUser(chatRoom, "Alice");
    User user2 = new ConcreteUser(chatRoom, "Bob");
    User user3 = new ConcreteUser(chatRoom, "Charlie");
    User user4 = new ConcreteUser(chatRoom, "Diana");

    chatRoom.addUser(user1);
    chatRoom.addUser(user2);
    chatRoom.addUser(user3);
    chatRoom.addUser(user4);

    user1.send("Hello, everyone!");
    user3.send("Hi, Alice!");
  }

}
