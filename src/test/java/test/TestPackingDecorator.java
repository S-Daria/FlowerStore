package test;

import Decorators.PackingDecorator;
import FlowerStore.Flower;
import FlowerStore.FlowerItem;
import FlowerStore.FlowerPack;
import FlowerStore.FlowerType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPackingDecorator {
    private Flower rose;
    private Flower tulip;
    private Flower chamomile;
    private FlowerItem roses;
    private FlowerItem tulips;
    private FlowerItem chamomiles;

    @Before
    public void init() {
        rose = new Flower(FlowerType.ROSE);
        tulip = new Flower(FlowerType.TULIP);
        chamomile = new Flower(FlowerType.CHAMOMILE);
        roses = new PackingDecorator(new FlowerPack(rose, 3));
        tulips = new PackingDecorator(new FlowerPack(tulip, 5));
        chamomiles = new PackingDecorator(new FlowerPack(chamomile, 7));
    }

    @Test
    public void testToString() {
        Assert.assertEquals(roses.toString(), "Pack (9$): {ROSE (3 flowers)} and additional packing for 2$");
        Assert.assertEquals(tulips.toString(), "Pack (10$): {TULIP (5 flowers)} and additional packing for 2$");
        Assert.assertEquals(chamomiles.toString(), "Pack (7$): {CHAMOMILE (7 flowers)} and additional packing for 2$");
    }
}
