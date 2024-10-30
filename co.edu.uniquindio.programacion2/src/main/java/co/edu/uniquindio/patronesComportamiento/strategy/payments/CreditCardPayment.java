package co.edu.uniquindio.patronesComportamiento.strategy.payments;

// Implementación de estrategias concretas
public class CreditCardPayment implements PaymentStrategy {
  private String cardNumber;

  public CreditCardPayment(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
  }
}
