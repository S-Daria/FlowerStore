package Delivery;

import FlowerStore.FlowerItem;
import java.util.List;

public interface DeliveryStrategy {
    String deliver(List<FlowerItem> items);
    void collectDeliveryDetails();
}
