package com.example.java8;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda1 {

	public static void main(String[] args) {
		Integer numbers[] = {3, 4, 5, 6 };

		Arrays.sort(numbers, (o1,  o2) -> {
				return o1.compareTo(02);
			});



		/*Arrays.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer first, Integer second) {
				return first.compareTo(second);
			}
		});*/
		
		
		/*Arrays.sort(numbers,(Integer first, Integer second) -> {
				return first.compareTo(second);
			}
		);*/
		
		//Arrays.sort(numbers,(first,second) -> first.compareTo(second));
		
         //Interface1 inf = (String name) -> { System.out.println(name);};
		 //Interface1 inf =  (name) -> { System.out.println(name);};
		 //Interface1 inf = (name) -> System.out.println(name);
		 Interface1 inf = System.out::println;
	}

}
//Lambda can only used when there is a interface with one abstract method.
interface  Interface1{
	void display(String name);
	//void show();
}