package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import flower.store.payments.CreditCardPaymentStrategy;
import flower.store.payments.PayPalPaymentStrategy;
import flower.store.payments.Payment;

public class PaymentTests {
    private Payment creditCardPay;
    private Payment payPal;
    private double price;
    private double zeroPrice;



    @BeforeEach
    public void init() {
        creditCardPay = new CreditCardPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
        price = 100.0;
        zeroPrice = 0.0;
    }


    @Test
    public void testCreditCardPaymentNonZero() {
        boolean paidByCard = creditCardPay.pay(price);
        assert (paidByCard);
    }

    @Test
    public void testPayPalPaymentNonZero() {
        boolean paidByPayPal = payPal.pay(price);
        assert (paidByPayPal);
    }

    @Test
    public void testPayPalPaymentZero() {
        boolean paidByPayPal = payPal.pay(zeroPrice);
        assert (!paidByPayPal);
    }

    @Test
    public void testCreditCardPaymentZero() {
        boolean paidByCard = creditCardPay.pay(zeroPrice);
        assert (!paidByCard);
    }
}