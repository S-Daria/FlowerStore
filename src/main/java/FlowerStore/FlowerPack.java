package FlowerStore;


public class FlowerPack {
    protected Flower flower;
    protected int number;

    public FlowerPack(Flower flower, int number){
        this.flower = flower;
        this.number = number;
    }

    public int getPrice(){
        return (this.flower.getPrice() * number);
    }

    public FlowerType getFlowerType(){
        return this.flower.getFlowerType();
    }

}
