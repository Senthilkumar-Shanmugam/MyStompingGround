package com.example.java8;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.ObjPtr;

import java.util.Optional;

public class OptionalDemo2 {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("sample");
        System.out.println(op1.isPresent());

        Optional<String> op2 = Optional.empty();
        System.out.println(op2.isPresent());

        Optional<String> op3 = Optional.ofNullable(null);
        System.out.println(op3.isPresent());

       // Optional<String> op4 = Optional.ofNullable("test");
        Optional<String> op4 = Optional.ofNullable(null);
        System.out.println(op4.isPresent());

        op4.ifPresent(s -> System.out.println(s));
        op4.orElse("Null value");
    }
}
