package test;

import FlowerStore.PostDeliveryStrategy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPostDeliveryStrategy {
    private PostDeliveryStrategy delivery;


    @Before
    public void init() {
        delivery = new PostDeliveryStrategy();
    }

    @Test
    public void testDeliver(){
        Assert.assertEquals(delivery.deliver("Ukraine", "Lviv", "Franka, 2"), "Delivering flowers to Franka, 2, Lviv using Post Delivery");
        Assert.assertEquals(delivery.deliver("Great Britain", "London", "Baker Street, 221B"), "Sorry, we cannot make international deliveries yet.");
    }
}
