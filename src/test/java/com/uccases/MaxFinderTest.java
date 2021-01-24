package com.uccases;

import org.junit.Assert;
import org.junit.Test;


public class MaxFinderTest {
    @Test
    public void givenThreeInteger_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder(300, -150, 400);
        int max = (int) maxFinder.maximum();
        Assert.assertEquals(400, max);
    }

    @Test
    public void givenThreeFloatValue_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder(-150.0f, 300.0f, 400.00f);
        Float max= (Float) maxFinder.maximum();
         Assert.assertEquals(400.0, max, 0);
    }

    @Test
    public void givenThreeStringValue_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder("Apple", "Banana", "Peach");
        String max = (String) maxFinder.maximum();
        Assert.assertEquals("Peach", max);
    }
}
