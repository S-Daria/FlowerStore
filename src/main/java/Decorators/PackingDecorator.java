package Decorators;

import FlowerStore.FlowerItem;

public class PackingDecorator extends ItemDecorator{

    public PackingDecorator(FlowerItem item) {
        super(item);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
    @Override
    public String toString() {
        return super.toString() + " and additional packing for 2$";
    }
}
