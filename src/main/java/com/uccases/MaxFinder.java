package com.uccases;

public class MaxFinder {

    public <E extends Comparable> E findMaxValue(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max) > 0 && b.compareTo(c) > 0)
            max = b;
        else if (c.compareTo(max) > 0)
            max = c;
        return max;
    }
}
