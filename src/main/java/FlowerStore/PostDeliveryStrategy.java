package FlowerStore;

import java.util.Scanner;

public class PostDeliveryStrategy implements DeliveryStrategy{
    public Scanner in = new Scanner(System.in);
    int duration = 3;
    String order = "flowers";

    @Override
    public void collectDeliveryDetails() {
        System.out.print("Enter your order: ");
        order = in.nextLine();
        System.out.print("Enter preferable delivery duration (in days): ");
        duration = in.nextInt();
    }

    /* Save customer data for future shopping attempts. */
    @Override
    public String deliver(String country, String city, String address) {
        if (country.equals("Ukraine")) {
            return "Delivering " + this.order + " to " + address + ", "  + city + " using Post Delivery";
        } else {
            return "Sorry, we cannot make international deliveries yet.";
        }
    }
}
