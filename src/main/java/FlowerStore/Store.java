package FlowerStore;

public class Store {
    protected FlowerBucket[] buckets;

    public Store(FlowerBucket[] buckets){
        this.buckets = buckets;
    }

    public String search(Flower flower){
        String returnStr = "";
        for (FlowerBucket flowerBucket: this.buckets){
            if (flowerBucket.find(flower)){
                returnStr += flowerBucket.toString();
            }
        }
        return returnStr;
    }
}
