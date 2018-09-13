package com.practise.design.pattern.creational.factorymethod;

public class ConcreteCreator extends AbstractCreator {

	public ConcreteCreator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public AbstractProduct factoryMethod() {
		System.out.println("Called: implementation of factory method; "
				+ "will return: ConcreteProduct instance");
		return new ConcreteProduct();
	}

}
