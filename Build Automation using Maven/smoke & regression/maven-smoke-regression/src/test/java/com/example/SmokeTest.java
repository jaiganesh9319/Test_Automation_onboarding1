package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {

    @Test(groups = "smoke")
    public void testMethod1() {
        System.out.println("Running Smoke Test: testMethod1");
        Assert.assertTrue(true);
    }

    @Test(groups = "smoke")
    public void testMethod2() {
        System.out.println("Running Smoke Test: testMethod2");
        Assert.assertEquals(2 + 2, 4);
    }
}
