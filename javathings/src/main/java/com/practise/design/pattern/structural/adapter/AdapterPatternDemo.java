package com.practise.design.pattern.structural.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
       Bird adaptee= new Sparrow();
       //Adapter has the same interface as the target interface
       //in this case ToyDuck all client code has been coded with
       //So when the need to work wird bird interface
       //they can be injected with adapter which has the same super target
       //type interface
       ToyDuck adapter = new ToyAdapter(adaptee);
       adapter.squeak();
	}

}
