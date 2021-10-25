package FlowerStore;

import java.awt.*;

public enum FlowerType {
    ROSE(2, 3),
    TULIP(1.5, 2),
    CHAMOMILE(4, 1);

    private double sepalLength;
    private int price;
    private Color color;
    FlowerType(double sepalLength, int price){
        this.sepalLength = sepalLength;
        this.price = price;
        this.color = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
    }
    public int getPrice(){
        return price;
    }
    public double getSepalLength(){
        return sepalLength;
    }
}
