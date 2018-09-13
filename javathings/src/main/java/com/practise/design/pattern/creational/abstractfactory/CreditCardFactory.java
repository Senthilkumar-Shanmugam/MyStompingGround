package com.practise.design.pattern.creational.abstractfactory;

import com.practise.design.pattern.creational.abstractfactory.amex.AmexFactory;
import com.practise.design.pattern.creational.abstractfactory.visa.Visafactory;

/**
 * This is the interface that contains the factory methods
 * for the products that belong together(family) 
 * might also have method/logic to return a specific factory
 * version based on some config param 
 * 
 * @author seshshan
 *
 */
public abstract class CreditCardFactory {
	//these are factory methods that return products that belong together
	public abstract CreditCard getCreditCard(CardType cardType);
	public abstract validator getValidator(CardType cardType);

	//method that returns a specific version of factory
	public static CreditCardFactory getCreditCardFactory(int credScore){
		if(credScore > 650)
			return new AmexFactory();
		else
			return new Visafactory();
	}
}
