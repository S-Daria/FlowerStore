package test;

import Decorators.RibbonDecorator;
import FlowerStore.Flower;
import FlowerStore.FlowerItem;
import FlowerStore.FlowerType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRibbonDecorator {
    private FlowerItem rose;
    private FlowerItem tulip;
    private FlowerItem chamomile;

    @Before
    public void init() {
        rose = new RibbonDecorator(new Flower(FlowerType.ROSE));
        tulip = new RibbonDecorator(new Flower(FlowerType.TULIP));
        chamomile = new RibbonDecorator(new Flower(FlowerType.CHAMOMILE));
    }

    @Test
    public void testToString() {
        Assert.assertEquals(rose.toString(), "ROSE{sepal_len=2.0, price=3$} and additional ribbon for 1$");
        Assert.assertEquals(tulip.toString(), "TULIP{sepal_len=1.5, price=2$} and additional ribbon for 1$");
        Assert.assertEquals(chamomile.toString(), "CHAMOMILE{sepal_len=4.0, price=1$} and additional ribbon for 1$");
    }
}
