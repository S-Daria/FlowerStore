package test;

import Payments.PayByPayPal;
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
    public void testPay(){
        Assert.assertTrue(payment.pay(30));
        Assert.assertFalse(payment.pay(130));
    }
}
