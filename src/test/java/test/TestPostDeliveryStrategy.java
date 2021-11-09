package test;

import Delivery.PostDeliveryStrategy;
import FlowerStore.Flower;
import FlowerStore.FlowerItem;
import FlowerStore.FlowerPack;
import FlowerStore.FlowerType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPostDeliveryStrategy {
    private PostDeliveryStrategy delivery;
    private Flower rose;
    private Flower tulip;
    private Flower chamomile;
    private FlowerPack roses;
    private FlowerPack tulips;
    private FlowerPack chamomiles;
    private FlowerStore.FlowerItem[] flowers;


    @Before

    public void init() {
        rose = new Flower(FlowerType.ROSE);
        tulip = new Flower(FlowerType.TULIP);
        chamomile = new Flower(FlowerType.CHAMOMILE);
        roses = new FlowerPack(rose, 3);
        tulips = new FlowerPack(tulip, 5);
        chamomiles = new FlowerPack(chamomile, 7);
        flowers = new FlowerItem[]{roses, tulips, chamomiles};
        delivery = new PostDeliveryStrategy();
    }

    @Test
    public void testDeliver(){
        Assert.assertEquals(delivery.deliver(flowers), "Delivering Pack (9$): {ROSE (3 flowers)} Pack (10$): {TULIP (5 flowers)} Pack (7$): {CHAMOMILE (7 flowers)} using Post Delivery");
    }
}
