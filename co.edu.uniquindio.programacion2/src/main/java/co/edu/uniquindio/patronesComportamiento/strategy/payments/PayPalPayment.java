package co.edu.uniquindio.patronesComportamiento.strategy.payments;

// Implementación de estrategias concretas
public class PayPalPayment implements PaymentStrategy {
  private String email;

  public PayPalPayment(String email) {
    this.email = email;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using PayPal: " + email);
  }
}
