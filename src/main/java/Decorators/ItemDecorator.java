package Decorators;

import FlowerStore.FlowerItem;

public class ItemDecorator extends FlowerItem{
    private FlowerItem item;

    public ItemDecorator(FlowerItem item){
        this.item = item;
    }

    @Override
    public int getPrice() {
        return item.getPrice();
    }
    @Override
    public String toString() {
        return item.toString();
    }
}
