package com.uccases;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxFinder<E extends Comparable<E>> {
    private E a, b, c;

    public MaxFinder() {
    }

    public MaxFinder(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public E maximum() {
        return findMaxValue(a, b, c);
    }

    public static <E extends Comparable> E findMaxValue(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max) > 0 && b.compareTo(c) > 0)
            max = b;
        else if (c.compareTo(max) > 0)
            max = c;
        MaxFinder.printmax(max);
        return max;
    }

    public static <E> E max(E... args) {
        List<E> collect = Arrays.stream(args).sorted().collect(Collectors.toList());
        return collect.get(collect.size()-1);

    }

    private static <E> void printmax(E max) {
        System.out.println(max + " is maximum");
    }

}
