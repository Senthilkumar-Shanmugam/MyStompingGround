/*
package com.example.java8;

import java.util.function.Consumer;

import lombok.Data;

@Data
class Car{
	private int id;
	private String color;
}

class Mechanic{
	public void fix(Car car) {
		System.out.println("Fixing the card:"+car.getId());
	}
}

public class ExistingObjectMethodReference {

	public static void main(String[] args) {
		final Mechanic mechanic = new Mechanic();
		Car car = new Car();
		//using anonymous class
		execute(car,new Consumer<Car>() {
			@Override
			public void accept(Car car) {
				mechanic.fix(car);
			}});
		
		
		//using lambda
		execute(car,(c) -> mechanic.fix(c));
		
		//using method reference
		execute(car,mechanic::fix);

	}
	public static void execute(Car car,Consumer<Car> c) {
		c.accept(car);
	}
}
*/