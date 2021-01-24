package com.uccases;

import org.junit.Assert;
import org.junit.Test;


public class MaxFinderTest {
    @Test
    public void givenThreeInteger_ShouldReturnMaxvalue() {
        MaxFinder maxFinder= new MaxFinder();
        int max = maxFinder.findMax(400, 300, -150);
        Assert.assertEquals(400,max);
    }
}
