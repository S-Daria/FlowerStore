package FlowerStore;

public interface DeliveryStrategy {
    String deliver(String country, String city, String address);
    void collectDeliveryDetails();
}
