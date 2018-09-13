package com.practise.design.pattern.creational.abstractfactory.visa;

import com.practise.design.pattern.creational.abstractfactory.CardType;
import com.practise.design.pattern.creational.abstractfactory.CreditCard;
import com.practise.design.pattern.creational.abstractfactory.CreditCardFactory;
import com.practise.design.pattern.creational.abstractfactory.validator;

public class Visafactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public validator getValidator(CardType cardType) {
		// TODO Auto-generated method stub
		return null;
	}

}
