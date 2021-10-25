package test;
import FlowerStore.Flower;
import FlowerStore.FlowerBucket;
import FlowerStore.FlowerType;
import FlowerStore.FlowerPack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestFlowerBucket {
    private Flower rose;
    private Flower tulip;
    private Flower chamomile;
    private FlowerPack roses;
    private FlowerPack tulips;
    private FlowerPack chamomiles;
    private FlowerBucket bucket;

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

    }

    @Test
    public void testGetPrice() {
        Assert.assertEquals(bucket.getPrice(), 26);
    }
    @Test
    public void testToString() {
        Assert.assertEquals(bucket.toString(), "Bucket (26$): {ROSE} {TULIP} {CHAMOMILE}");
    }
    @Test
    public void testFind() {
        Assert.assertTrue(bucket.find(rose));
    }

}

