package com.practise.java8;

public class FunctionalStyle1 {
	private int totalDistanceTravelled;
	private int price;
	
	public FunctionalStyle1(){
	   this.totalDistanceTravelled=90;
	   this.price=1000;
	}
	
	public double calculateCurrentValue(){
		return this.price-(this.totalDistanceTravelled*0.10);
	}
	
	public double FunctionalStyleCalculate(int totalDist,int price){
		return price-(totalDist*0.10);
	}

	public static void main(String[] args) {
		FunctionalStyle1 ob = new FunctionalStyle1();
		System.out.println("Funational Style:"+ob.FunctionalStyleCalculate(ob.totalDistanceTravelled, ob.price));
		System.out.println("Imperative style>>"+ob.calculateCurrentValue());
	}

}
