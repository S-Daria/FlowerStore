package Payments;

public class PaymentContext {

    private PayStrategy strategy;

    public PaymentContext(PayStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment(double bill) {
        this.strategy.pay(bill);
    }

}
