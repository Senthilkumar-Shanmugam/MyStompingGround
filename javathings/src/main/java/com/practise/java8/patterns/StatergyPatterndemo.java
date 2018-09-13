package com.practise.java8.patterns;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * demostrates with the use of lambda functional style 
 * higher order functions removes the duplicacy in the 
 * solution of sum of list,sum of even nos,sum of odd nums
 * @author seshshan
 *
 */
public class StatergyPatterndemo {
	
	private static int totalValue(List<Integer> values,Predicate<Integer> selector){
		/*int total = 0;
		for(int e:values){
			if(selector.test(e))
			total += e;
		}*/
		
		//Refactor into functional style
		
		return values.stream()
				.filter(selector)
				.reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
	    List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("total >>"+totalValue(numbers, e -> true));
        System.out.println("even total >>"+totalValue(numbers, e -> e %2 == 0));
        System.out.println("odd total >>"+totalValue(numbers, e -> e %2 != 0));


	}

}
