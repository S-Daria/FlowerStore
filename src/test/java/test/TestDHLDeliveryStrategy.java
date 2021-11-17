package test;
import Delivery.DHLDeliveryStrategy;
import Delivery.PostDeliveryStrategy;
import FlowerStore.Flower;
import FlowerStore.FlowerItem;
import FlowerStore.FlowerPack;
import FlowerStore.FlowerType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDHLDeliveryStrategy {
    private PostDeliveryStrategy delivery;
    private Flower rose;
    private Flower tulip;
    private Flower chamomile;
    private FlowerPack roses;
    private FlowerPack tulips;
    private FlowerPack chamomiles;
    private DHLDeliveryStrategy dhldelivery;
    private List<FlowerItem> flowers;


    @Before
    public void init() {
        rose = new Flower(FlowerType.ROSE);
        tulip = new Flower(FlowerType.TULIP);
        chamomile = new Flower(FlowerType.CHAMOMILE);
        roses = new FlowerPack(rose, 3);
        tulips = new FlowerPack(tulip, 5);
        chamomiles = new FlowerPack(chamomile, 7);
        flowers = Arrays.asList(roses, tulips, chamomiles);
        dhldelivery = new DHLDeliveryStrategy();
    }

    @Test
    public void testDeliver(){
        Assert.assertEquals(dhldelivery.deliver(flowers), "Delivering Pack (9$): {ROSE (3 flowers)} Pack (10$): {TULIP (5 flowers)} Pack (7$): {CHAMOMILE (7 flowers)} using DHL Delivery");
    }
}
