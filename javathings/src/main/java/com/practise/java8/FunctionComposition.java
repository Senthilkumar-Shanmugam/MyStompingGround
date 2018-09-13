package com.practise.java8;

import java.util.Arrays;
import java.util.List;

public class FunctionComposition {

	public static void main(String[] args) {
	    List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	    //get the double of square root of even numbers
	    System.out.println(
	    		numbers.stream()
	    		.filter(e -> e % 2 == 0)
	    		.mapToDouble(Math::sqrt)
	            .sum());
	    
	}

}
