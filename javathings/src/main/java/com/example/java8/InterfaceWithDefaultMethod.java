package com.example.java8;

public interface InterfaceWithDefaultMethod {
    default void show(){
        System.out.println("this is default interface method");
    }

    static void display(){
        System.out.println("this is a static method in interface");
    }
}
