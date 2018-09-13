package com.practise.design.pattern.creational.factorymethod;

public class ConcreteProduct implements AbstractProduct{

	public ConcreteProduct() {
		System.out.println("Created: concrete product instance");		
	}

	@Override
	public void feature() {
		System.out.println("Called: concrete product feature");
	}

}
