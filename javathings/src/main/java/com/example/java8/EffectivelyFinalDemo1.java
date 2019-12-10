package com.example.java8;

import java.util.function.Supplier;

public class EffectivelyFinalDemo1 {
    public static void main(String[] args) {
        int start=10;
        System.out.println(increment(start));
    }

    static Supplier<Integer>  increment(int start){
       // return ()-> start++; cant change effectively final local
        return ()-> start;
    }
}
