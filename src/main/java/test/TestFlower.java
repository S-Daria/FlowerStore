package test;
import FlowerStore.Flower;
import FlowerStore.FlowerType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestFlower {
    private Flower rose;
    private Flower tulip;
    private Flower chamomile;

    @Before
    public void init() {
        rose = new Flower(FlowerType.ROSE);
        tulip = new Flower(FlowerType.TULIP);
        chamomile = new Flower(FlowerType.CHAMOMILE);
    }

    @Test
    public void testToString() {
        Assert.assertEquals(rose.toString(), "ROSE{sepal_len=2.0, price=3$}");
        Assert.assertEquals(tulip.toString(), "TULIP{sepal_len=1.5, price=2$}");
        Assert.assertEquals(chamomile.toString(), "CHAMOMILE{sepal_len=4.0, price=1$}");
    }

}
