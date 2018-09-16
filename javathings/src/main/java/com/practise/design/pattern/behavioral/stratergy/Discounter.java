package com.practise.design.pattern.behavioral.stratergy;

import java.math.BigDecimal;

public interface Discounter {
	BigDecimal applyDiscount(BigDecimal amount);

	static Discounter DeewaliDiscounter(){
		return amount -> amount.multiply(BigDecimal.valueOf(0.9));
	}
	
	static Discounter PongaDiscounter(){
		return amount -> amount.multiply(BigDecimal.valueOf(0.7));
	}
	
	static Discounter newyearDiscounter(){
		return amount -> amount.multiply(BigDecimal.valueOf(0.8));
	}


}
