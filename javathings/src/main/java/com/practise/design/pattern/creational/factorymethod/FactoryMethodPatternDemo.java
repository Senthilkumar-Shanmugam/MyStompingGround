package com.practise.design.pattern.creational.factorymethod;

import java.util.Calendar;
import java.util.ResourceBundle;

/**
 * Typical usage of factory method pattern by clients
 * they want products, dont need to know what type of products
 * so they dont tied to the exact product type
 * @author seshshan
 *
 */
public class FactoryMethodPatternDemo {

	public static void main(String[] args) {
     AbstractCreator factory = new ConcreteCreator();
     AbstractProduct product = new ConcreteProduct();
     product.feature();
     
	}

}
