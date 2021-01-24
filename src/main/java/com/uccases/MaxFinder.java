package com.uccases;

public class MaxFinder<E extends  Comparable<E>> {
          private E a,b,c;

    public MaxFinder(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public E maximum(){
        return findMaxValue(a,b,c);
    }

    public static <E extends Comparable> E findMaxValue(E a,E b,E c) {
        E max =  a;
        if (b.compareTo(max) > 0 && b.compareTo(c) > 0)
            max = b;
        else if (c.compareTo(max) > 0)
            max = c;
        return max;
    }
}
