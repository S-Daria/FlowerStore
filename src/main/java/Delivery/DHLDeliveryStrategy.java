package Delivery;

import Payments.PayByPayPal;

import java.util.Scanner;

public class DHLDeliveryStrategy implements DeliveryStrategy{
    public Scanner in = new Scanner(System.in);
    double price = 100;
    String order = "flowers";

    @Override
    public void collectDeliveryDetails() {
        System.out.print("Enter your order: ");
        order = in.nextLine();
        System.out.print("Enter approximate order price: ");
        price = in.nextInt();
    }

    /* Save customer data for future shopping attempts. */
    @Override
    public String deliver(String country, String city, String address) {
        PayByPayPal payment = new PayByPayPal();
        if (payment.pay(this.price / 100)) {
            return "Delivering " + this.order + " to " + address + ", "  + city + " using DHL Delivery";
        } else {
            return "Sorry, payment for the delivery was not successful.";
        }
    }
}
