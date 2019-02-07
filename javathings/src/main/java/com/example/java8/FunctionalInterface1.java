package com.example.java8;


@FunctionalInterface
public interface FunctionalInterface1 {
   void display();
   default void show() {
	   System.out.println("display");
   }
}
