package com.uccases;

import org.junit.Assert;
import org.junit.Test;


public class MaxFinderTest {
    @Test
    public void givenThreeInteger_ShouldReturnMaxvalue() {
        MaxFinder maxFinder= new MaxFinder();
        int max = maxFinder.findMax(300, -150, 400);
        Assert.assertEquals(400,max);
    }

    @Test
    public void givenThreeFloatValue_ShouldReturnMaxvalue() {
        MaxFinder maxFinder= new MaxFinder();
        Float max = maxFinder.findFloatMax(400.0f, -150.00f, 300.00f);
        Assert.assertEquals(400.0,max,0);
    }
}
