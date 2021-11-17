package FlowerStore;

import Delivery.DeliveryStrategy;
import Payments.PayStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.LinkedList;

public class Order {
    private LinkedList<FlowerItem> flowers = new LinkedList<>();
    private LinkedList<User> users = new LinkedList<>();
    @Setter
    private PayStrategy payment;
    @Setter
    private DeliveryStrategy delivery;
    private String status = "No status";

    public Order(LinkedList<FlowerItem> flowers, PayStrategy payment, DeliveryStrategy delivery) {
        this.flowers = flowers;
        this.payment = payment;
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (FlowerItem item : flowers) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public void processOrder() {
        double price = this.calculateTotalPrice();
        payment.pay(price);
        delivery.deliver(flowers);
    }

    public void addItem(FlowerItem item) {
        this.flowers.add(item);
    }

    public void removeItem(FlowerItem item) {
        this.flowers.remove(item);
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update(this.status);
        }
    }

    public void order() {
        notifyUsers();
    }
}
