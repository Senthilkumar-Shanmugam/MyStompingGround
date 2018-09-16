package com.practise.design.pattern.behavioral.stratergy;

import java.math.BigDecimal;

/**
 * Lets us choose one of many possible algorithms and stratergy's
 * @author seshshan
 *
 */

interface Discount{
	BigDecimal applyDiscount(BigDecimal amount);
	
}
public class StratergyPatternDemo1 {

	public static class EasterDiscounter implements Discount{

		@Override
		public BigDecimal applyDiscount(BigDecimal amount) {
			return amount.multiply(BigDecimal.valueOf(0.5));
		}
		
	}
	
	public static class ChristmasDiscounter implements Discount{

		@Override
		public BigDecimal applyDiscount(BigDecimal amount) {
			return amount.multiply(BigDecimal.valueOf(0.5));
		}
		
	}

	
	
	public static void main(String[] args) {
		Discount easterDiscounter = new EasterDiscounter();
		
		BigDecimal discountedValue = easterDiscounter.applyDiscount(BigDecimal.valueOf(100));
		
	}

}
