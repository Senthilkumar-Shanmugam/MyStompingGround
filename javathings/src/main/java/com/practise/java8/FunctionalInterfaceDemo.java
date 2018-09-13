package com.practise.java8;

import java.util.function.Function;

public class FunctionalInterfaceDemo {
	
	public static void doWork(int value,Function<Integer,Integer> func){
		System.out.println(func.apply(value));
	}

	public static void main(String[] args) {
       Function<Integer,Integer> inc = e -> e+1;
       Function<Integer,Integer> double1 = e -> e*2;

       doWork(10, inc);
       doWork(10, double1);
       
       //increment and double
      /* int temp = inc.apply(10);
       System.out.println(double1.apply(temp));
*/
       doWork(10, inc.andThen(double1));
	}

}
