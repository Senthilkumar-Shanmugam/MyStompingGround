package com.practise.design.pattern.behavioral.templatemethod;

public class TemplateMethodPatternDemmo {

	public static void main(String[] args) {
		System.out.println("Web Order: ");
        OrderTemplate webOrder = new OnlineOrder();
        webOrder.processOrder();

        System.out.println("Store Order: ");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
	}

}
