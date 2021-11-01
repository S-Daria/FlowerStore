package FlowerStore;

public interface PayStrategy {
    boolean pay(double paymentAmount);
    void collectPaymentDetails();
}
