package test;
import Delivery.DHLDeliveryStrategy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDHLDeliveryStrategy {
    private DHLDeliveryStrategy dhldelivery;


    @Before
    public void init() {
        dhldelivery = new DHLDeliveryStrategy();
    }

    @Test
    public void testDeliver(){
        Assert.assertEquals(dhldelivery.deliver("Ukraine", "Lviv", "Franka, 2"), "Delivering flowers to Franka, 2, Lviv using DHL Delivery");
    }
}
