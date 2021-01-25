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

    @Test
    public void givenFiveIntegerinVarargs_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        int max = (int) maxFinder.max(300, -150, 400,700,200);
        Assert.assertEquals(700, max);
    }

    @Test
    public void givenFiveFloatinVarargs_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        float max = (float) maxFinder.max(300.6f, -150.44f, 400.23f,70.20f,23.200f);
        Assert.assertEquals(400.23f, max,0);
    }

    @Test
    public void givenSixStringinVarargs_ShouldReturnMaxvalue() {
        MaxFinder maxFinder = new MaxFinder();
        String  max = (String) maxFinder.max("Apple","Banana","Orange","Mango","Pineapple","Jackfruit");
        Assert.assertEquals("Pineapple", max);
    }
}
