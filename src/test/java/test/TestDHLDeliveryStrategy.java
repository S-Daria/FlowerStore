package test;
import FlowerStore.DHLDeliveryStrategy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDHLDeliveryStrategy {
    private DHLDeliveryStrategy delivery;


    @Before
    public void init() {
        delivery = new DHLDeliveryStrategy();
    }

    @Test
    public void testDeliver(){
        Assert.assertEquals(delivery.deliver("Ukraine", "Lviv", "Franka, 2"), "Delivering flowers to Franka, 2, Lviv using DHL Delivery");
    }
}
