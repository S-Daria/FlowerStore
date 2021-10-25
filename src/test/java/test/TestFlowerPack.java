package test;
import FlowerStore.Flower;
import FlowerStore.FlowerType;
import FlowerStore.FlowerPack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestFlowerPack {
    private Flower rose;
    private Flower tulip;
    private Flower chamomile;
    private FlowerPack roses;
    private FlowerPack tulips;
    private FlowerPack chamomiles;

    @Before
    public void init() {
        rose = new Flower(FlowerType.ROSE);
        tulip = new Flower(FlowerType.TULIP);
        chamomile = new Flower(FlowerType.CHAMOMILE);
        roses = new FlowerPack(rose, 3);
        tulips = new FlowerPack(tulip, 5);
        chamomiles = new FlowerPack(chamomile, 7);
    }

    @Test
    public void testGetPrice() {
        Assert.assertEquals(roses.getPrice(), 9);
        Assert.assertEquals(tulips.getPrice(), 10);
        Assert.assertEquals(chamomiles.getPrice(), 7);
    }

}

