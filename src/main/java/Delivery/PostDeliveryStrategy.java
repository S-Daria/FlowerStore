package Delivery;

import FlowerStore.FlowerItem;

import java.util.Scanner;

public class PostDeliveryStrategy implements DeliveryStrategy{

    @Override
    public void collectDeliveryDetails() {

    }

    @Override
    public String deliver(FlowerStore.FlowerItem[] items) {
        String return_str = "Delivering ";
        for (FlowerItem el: items){
            return_str = return_str + el.toString() + " ";
        }
        return_str += "using Post Delivery";
        return return_str;
    }
}
