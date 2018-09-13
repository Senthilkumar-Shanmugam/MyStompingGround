package com.practise.java8;

import java.util.Arrays;
import java.util.List;

public class DeclarativeStyleDemo {

	public static void main(String[] args) {
	    List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	    //Impertavive style
	    int total = 0;
	    //find the total of double of even numbers
	    for(int no:numbers){
	    	if(no%2 ==0)
	    		total+=(no*2);
	    }
	    
	    System.out.println("Total>>"+total);
	    
	    //Declarative stype
	    System.out.println(numbers.stream()
	    		.filter(e -> e%2 == 0) //higher oder function.takes predicate--> function as argument
	            .mapToInt(e-> e*2) // takes function as input
	            .sum());
	                      
	    
	}

}
