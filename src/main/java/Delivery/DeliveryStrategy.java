package Delivery;

public interface DeliveryStrategy {
    String deliver(FlowerStore.FlowerItem[] items);
    void collectDeliveryDetails();
}
