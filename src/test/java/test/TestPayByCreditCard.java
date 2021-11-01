package test;

import Payments.PayByCreditCard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPayByCreditCard {
    private PayByCreditCard credit_payment;


    @Before
    public void init() {
        credit_payment = new PayByCreditCard();
    }

    @Test
    public void testPay(){
        Assert.assertTrue(credit_payment.pay(50));
        Assert.assertTrue(credit_payment.pay(50));
        Assert.assertFalse(credit_payment.pay(50));
        Assert.assertFalse(credit_payment.pay(130));
    }
}
