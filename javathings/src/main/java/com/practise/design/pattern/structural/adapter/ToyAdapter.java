package com.practise.design.pattern.structural.adapter;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ToyAdapter implements ToyDuck {
   Bird bird;//has reference to adaptee and delegates the request
   
   public ToyAdapter(Bird bird){
	   this.bird=bird;
   }
	@Override
	public void squeak() {
        bird.makeSound();		
	}


}
