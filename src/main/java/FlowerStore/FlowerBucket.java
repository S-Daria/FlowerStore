package FlowerStore;

public class FlowerBucket extends FlowerItem{
    protected FlowerPack[] flowers;
    protected int price = 0;

    public FlowerBucket(FlowerPack[] flowers){
        this.flowers = flowers;
        setPrice(flowers);
    }

    protected void setPrice(FlowerPack[] flowers){
        int price = 0;
        for (FlowerPack flowerPack: flowers){
            price += flowerPack.getPrice();
        }
        this.price = price;
    }

    @Override
    public int getPrice(){
        return this.price;
    }

    public boolean find(Flower flower){
        for (FlowerPack flowerPack: this.flowers) {
            if (flowerPack.getFlowerType() == flower.flowerType){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String returnStr = "Bucket (" + this.price + "$):";
        for (FlowerPack flowerPack: this.flowers) {
            String packStr = " {" + flowerPack.getFlowerType() + "}";
            returnStr += packStr;
        }
        return returnStr;
    }

    /*public static void main(String[] args){
        Flower rose = new Flower(FlowerType.ROSE);
        Flower tulip = new Flower(FlowerType.TULIP);
        Flower chamomile = new Flower(FlowerType.CHAMOMILE);
        FlowerPack roses = new FlowerPack(rose, 3);
        FlowerPack tulips = new FlowerPack(tulip, 5);
        FlowerPack chamomiles = new FlowerPack(chamomile, 7);
        FlowerPack[] flowers = {roses, tulips, chamomiles};
        FlowerBucket bucket = new FlowerBucket(flowers);
        System.out.println(bucket.getPrice());
    }*/

}
