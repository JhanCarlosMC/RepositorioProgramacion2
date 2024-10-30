package co.edu.uniquindio.patronesComportamiento.strategy.payments;

// Clase principal para probar el patrón
public class MainStrategy {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
    cart.checkout(500);

    cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
    cart.checkout(300);
  }
}
