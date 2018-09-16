package com.practise.design.pattern.behavioral.stratergy;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

interface  Dicounter extends UnaryOperator<BigDecimal>{
	default Discounter combine(Discounter after){
		return value -> after.apply(this.apply(value));
	}
}

public class FunctionCompositionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
