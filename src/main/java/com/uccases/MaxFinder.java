package com.uccases;

public class MaxFinder {
    public int findMax(Integer a, Integer b, Integer c) {
        int max = a;
        if (b.compareTo(max) > 0 && b.compareTo(c) > 0 )
            max = b;
        else if (c.compareTo(max) > 0)
            max = c;
        return max;
    }

    public float findFloatMax(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0 && b.compareTo(c) > 0 )
            max = b;
        else if (c.compareTo(max) > 0)
            max = c;
        return max;
    }
}
