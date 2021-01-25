package com.uccases;

public class MaxFinder<E extends  Comparable<E>> {
          private E a,b,c;

    public MaxFinder() {
    }

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

    public E max(E ... args){
        E max = args[0];
        for (E maxFinder:args) {
            if(maxFinder.compareTo(max) > 0)
                max=maxFinder;
        }
        return max;
    }
}
