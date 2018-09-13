package com.practise.design.pattern.creational.abstractfactory;

//import javax.xml.parsers.DocumentBuilderFactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		//Client doesnt know what factory it gets
		CreditCardFactory factory = CreditCardFactory.getCreditCardFactory(670);
		//now the factory will return related objects from its factory methods
		CreditCard card= factory.getCreditCard(CardType.GOLD);
		
		
	}

}
