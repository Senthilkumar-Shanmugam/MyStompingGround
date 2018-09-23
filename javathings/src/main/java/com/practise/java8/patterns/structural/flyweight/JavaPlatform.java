package com.practise.java8.patterns.structural.flyweight;

public class JavaPlatform implements Platform {

	@Override
	public void execute(Code code) {
        System.out.println("Compiling and executing java code.");
	}

}
