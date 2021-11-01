package Payments;

public interface PayStrategy {
    boolean pay(double paymentAmount);
    void collectPaymentDetails();
}
