package com.example.java8;

import java.util.Optional;

public class OptionalDemp {
    public static void main(String[] args) {
        //create with null
        Optional<String> optionalS = Optional.empty();

        System.out.println(optionalS.isPresent());
        String name="baeldung";

        Optional<String> optionalS1 = Optional.of(name);
        System.out.println(optionalS1.isPresent()+":"+optionalS1.get());

       // Optional<String> op3 = Optional.ofNullable()

    }
}
