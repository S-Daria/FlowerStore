package test;

import FlowerStore.PayByPayPal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPayByPayPal {
    private PayByPayPal payment;


    @Before
    public void init() {
        payment = new PayByPayPal();
    }

    @Test
    public void testDeliver(){
        Assert.assertTrue(payment.pay(30));
        Assert.assertFalse(payment.pay(130));
        //Assert.assertTrue(payment.pay(130));
    }
}
