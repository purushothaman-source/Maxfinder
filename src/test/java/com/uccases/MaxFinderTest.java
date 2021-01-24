package com.uccases;

import org.junit.Assert;
import org.junit.Test;


public class MaxFinderTest {
    @Test
    public void givenThreeInteger_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        int max = maxFinder.findMaxValue(300, -150, 400);
        Assert.assertEquals(400, max);
    }

    @Test
    public void givenThreeFloatValue_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        Float max = maxFinder.findMaxValue(-150.0f, 300.0f, 400.00f);
        Assert.assertEquals(400.0, max, 0);
    }

    @Test
    public void givenThreeStringValue_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        String max = maxFinder.findMaxValue("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", max);
    }
}
