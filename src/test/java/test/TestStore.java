package test;
import FlowerStore.Flower;
import FlowerStore.FlowerBucket;
import FlowerStore.FlowerType;
import FlowerStore.FlowerPack;
import FlowerStore.Store;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestStore {
    private Flower rose;
    private Flower tulip;
    private Flower chamomile;
    private FlowerPack roses;
    private FlowerPack tulips;
    private FlowerPack chamomiles;
    private FlowerBucket bucket;
    private Store store;

    @Before
    public void init() {
        rose = new Flower(FlowerType.ROSE);
        tulip = new Flower(FlowerType.TULIP);
        chamomile = new Flower(FlowerType.CHAMOMILE);
        roses = new FlowerPack(rose, 3);
        tulips = new FlowerPack(tulip, 5);
        chamomiles = new FlowerPack(chamomile, 7);
        FlowerPack[] flowers = {roses, tulips, chamomiles};
        bucket = new FlowerBucket(flowers);
        FlowerBucket[] buckets = {bucket};
        store = new Store(buckets);

    }


    @Test
    public void testSearch() {
        Assert.assertEquals(store.search(rose), "Bucket (26$): {ROSE} {TULIP} {CHAMOMILE}");
    }

}

