package com.practise.design.pattern.structural.adapter;

public class Sparrow implements Bird {

	@Override
	public void fly() {
		System.out.println("flying");
	}

	@Override
	public void makeSound() {
		System.out.println("chirp chirp");
	}

}
