package co.edu.uniquindio.patronesComportamiento.strategy.payments;

// Contexto que utiliza la estrategia
public class ShoppingCart {
  private PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void checkout(int amount) {
    if (paymentStrategy == null) {
      System.out.println("Payment method not set!");
      return;
    }
    paymentStrategy.pay(amount);
  }
}
