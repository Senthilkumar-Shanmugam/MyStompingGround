/*
package com.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lombok.Data;

public class Closure1 {

	public static void main(String...strings) {
		
	}
	package com.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lombok.Data;

	public class Closure1 {

		public static void main(String...strings) {

		}

		private static List<Person> findRetirees(List<Person> persons){
			int retAge = 55;

		/*List<Person> retirees = filter(persons,new Predicate<Person>() {
			@Override
			public boolean test(Person t) {
				return t.getAge() > retAge;
			}
		});

			//using lambdas
			List<Person> retirees = filter(persons,(p) -> p.getAge() > retAge);


			return retirees;
		}

		private static List<Person> filter(List<Person> people, Predicate<Person> predicate){
			ArrayList<Person> matches = new ArrayList<Person>();

			for(Person p : people) {
				if(predicate.test(p))
					matches.add(p);
			}
			return matches;
		}
	}

	@Data
	class Person{
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		private int age;
	}




	private static List<Person> findRetirees(List<Person> persons){
		int retAge = 55;
		
		/*List<Person> retirees = filter(persons,new Predicate<Person>() {
			@Override
			public boolean test(Person t) {
				return t.getAge() > retAge;
			}
		});
		
		//using lambdas
		List<Person> retirees = filter(persons,(p) -> p.getAge() > retAge);
		
		
		return retirees;
	}
	
	private static List<Person> filter(List<Person> people, Predicate<Person> predicate){
		ArrayList<Person> matches = new ArrayList<Person>();
		
		for(Person p : people) {
			if(predicate.test(p))
				matches.add(p);
		}
		return matches;
	}
}

@Data
class Person{
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
}



*/