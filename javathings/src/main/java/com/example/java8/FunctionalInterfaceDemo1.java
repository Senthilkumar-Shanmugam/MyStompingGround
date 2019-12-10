package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Types . Function,Supplier,Consumer,Predicate
 * Operators - Unary , Binary
 */
public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Martin","Francis","Jonathan");

        //consumer example.. just consumes a value and produces side effects
        //names.forEach( n -> System.out.println(n));

        //using method reference
        names.forEach(System.out::println);

        //predicate example

        names.stream().filter( n -> n.startsWith("A")) //predicate fn..
                      .collect(Collectors.toList());

        //operators sample.. receive and return same type
        names.replaceAll( n -> n.toLowerCase());


        //Binary operator.. reduce use case .. sum of collection of all usecases
        List<Integer> numbers = Arrays.asList(3, 5, 8, 9, 12);

        int sum = numbers.stream().reduce(2,(v1,v2) -> v1+ v2);

        System.out.println(sum);

    }
}
