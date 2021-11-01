package FlowerStore;

import java.util.Scanner;

public class PayByCreditCard implements PayStrategy {
    public Scanner in = new Scanner(System.in);
    private BankAccount bank_account;

    @Override
    public void collectPaymentDetails() {

        System.out.print("Enter money on you bank account code: ");
        double money = in.nextDouble();
        bank_account = new BankAccount(money);

    }

    /* Save customer data for future shopping attempts. */
    @Override
    public boolean pay(double paymentAmount) {
        if (bank_account.canAfford(paymentAmount)) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            bank_account.pay(paymentAmount);
            return true;
        } else {
            bank_account.pay(paymentAmount);
            return false;
        }
    }
}