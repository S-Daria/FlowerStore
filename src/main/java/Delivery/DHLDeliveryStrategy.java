package Delivery;


import java.util.List;

import FlowerStore.FlowerItem;
import Payments.PayByPayPal;



public class DHLDeliveryStrategy implements DeliveryStrategy{


    @Override
    public void collectDeliveryDetails() {
    }
    @Override
    public String deliver(List<FlowerItem> items) {
        String return_str = "Delivering ";
        for (int i = 0; i < items.size(); i++){
            return_str = return_str + items.get(i).toString() + " ";
        }
        return_str += "using DHL Delivery";
        return return_str;
    }
}
