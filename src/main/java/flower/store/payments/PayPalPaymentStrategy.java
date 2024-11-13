package flower.store.payments;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PayPalPaymentStrategy implements Payment {

    @Override
    public boolean pay(double price) {
        if (price > 0) {
            System.out.printf("The amount of %.2f is paid using PayPal.%n", price);
            return true;
        }
        System.out.println("No payment made: amount is zero or negative.");
        return false;
    }
}