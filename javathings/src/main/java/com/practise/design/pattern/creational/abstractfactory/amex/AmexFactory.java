package com.practise.design.pattern.creational.abstractfactory.amex;

import com.practise.design.pattern.creational.abstractfactory.CardType;
import com.practise.design.pattern.creational.abstractfactory.CreditCard;
import com.practise.design.pattern.creational.abstractfactory.CreditCardFactory;
import com.practise.design.pattern.creational.abstractfactory.validator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		return null;
	}

	@Override
	public validator getValidator(CardType cardType) {
		return null;
	}

}
