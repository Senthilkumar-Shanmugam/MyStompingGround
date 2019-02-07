package com.example.java8;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda1 {

	public static void main(String[] args) {
		Integer numbers[] = { 3, 4, 5, 6 };

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
		
		Arrays.sort(numbers,(first,second) -> first.compareTo(second));
		

	}

}
