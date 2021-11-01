package Decorators;

import FlowerStore.FlowerItem;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(FlowerItem item) {
        super(item);
    }
    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
    @Override
    public String toString() {
        return super.toString() + " and additional ribbon for 1$";
    }
}
