package FlowerStore;


public class FlowerPack extends FlowerItem{
    protected Flower flower;
    protected int number;

    public FlowerPack(Flower flower, int number){
        this.flower = flower;
        this.number = number;
    }
    @Override
    public int getPrice(){
        return (this.flower.getPrice() * number);
    }

    public FlowerType getFlowerType(){
        return this.flower.getFlowerType();
    }

    @Override
    public String toString(){
        return "Pack (" + getPrice() + "$):" + " {" + getFlowerType() + " (" + this.number + " flowers)" +"}";
    }

}
