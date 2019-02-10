package com.example.java8;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

public class ConstructorMethodReference3 {

	public static void main(String[] args) {

	}
	
	
	private static void usage() {
		List<Person>  persons = new ArrayList<>();
		//using lambda
		initialize(persons, () -> new Person());
		
		//using method reference
		initialize(persons,Person::new);
	}
	
	private static <T> void initialize(List<T> list, Factory<T> factory) {
		for(int i = 1;i<=10;i++) {
			list.add(factory.create());
		}
	}
}

@FunctionalInterface
interface Factory<T>{
	T create();
}


@Data
class Person{
	private String name;
	private int age;
	private String email;
	private String address;
}
