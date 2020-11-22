package org.example;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorImplTest {

    @Test
    @Ignore // dont want to run this test case
    public void sum() {
        ICalculator calculator = new CalculatorImpl();
        int result = calculator.sum(10,20);
        Assert.assertEquals(30, result);
    }

    @Test
    public void div() {
        ICalculator calculator = new CalculatorImpl();
        int result = calculator.div(10,5);
        Assert.assertEquals(2, result);
    }

//    @Test(expected = ArithmeticException.class )
    @Test
    public void div1() {
        ICalculator calculator = new CalculatorImpl();
        int result = calculator.div(10,0);
        Assert.assertEquals(0, result);
    }
}