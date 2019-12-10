package com.example.java8.streams;

import java.util.stream.Stream;

public class StreamLazyEvaluation {
    public static void main(String[] args) {

        //Below is not evaluated , since there is no terminal operation
        //only intermediate operation
        Stream.of("a1","a2","a3","a4","a5")
                .filter( s -> {
                    System.out.println("inside filter lazy evaluation");
                    return true;
                });

        //the same above will now be run when there is a terminal operation
        // Notice the execution is vertical, one element at a time in pipe
        // instead of horizonatl
        Stream.of("a1","a2","a3","a4","a5")
                .filter( s -> {
                    System.out.println("inside filter lazy evaluation");
                    return true;
                })
               .forEach( s -> System.out.println("for each:"+s));


        //Due to the vertical execution of the stream chain, map has only to be executed twice in this case.
        // So instead of mapping all elements of the stream, map will be called as few as possible.

         Stream.of("d2", "a2", "b1", "b3", "c")
                .map( s-> {
                    System.out.println("Inside map function>>"+s);
                    return s.toUpperCase();
                })
                .anyMatch( s -> {
                    System.out.println("inside any match");
                    return s.startsWith("A");
                });

         // sorting is a special kind of intermediary operation
         // it is a stateful operation. its executed horizontally
        Stream.of("d2", "a2", "b1", "b3", "c")
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

    }
}
