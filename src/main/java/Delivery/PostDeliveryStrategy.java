package Delivery;

import FlowerStore.FlowerItem;

import java.util.List;
import java.util.Scanner;

public class PostDeliveryStrategy implements DeliveryStrategy{

    @Override
    public void collectDeliveryDetails() {

    }

    @Override
    public String deliver(List<FlowerItem> items) {
        String return_str = "Delivering ";
        for (int i = 0; i < items.size(); i++){
            return_str = return_str + items.get(i).toString() + " ";
        }
        return_str += "using Post Delivery";
        return return_str;
    }
}
