package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTest {

    @Test(groups = "regression")
    public void testMethod1() {
        System.out.println("Running Regression Test: testMethod1");
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void testMethod2() {
        System.out.println("Running Regression Test: testMethod2");
        Assert.assertEquals(5 + 3, 8);
    }
}
