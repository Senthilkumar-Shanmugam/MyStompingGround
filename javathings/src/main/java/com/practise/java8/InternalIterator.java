package com.practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.omg.Messaging.SyncScopeHelper;

public class InternalIterator {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	    /*System.out.println("Legacy for");
	    for(int i = 0; i < numbers.size(); i++) {
	      System.out.print(" "+i);
	    }
	    System.out.println("\nenhanced for");
	    for(int e : numbers) {
	      System.out.print(" "+e);
	    }
	    
	    numbers.forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer arg0) {
				System.out.print(" "+arg0);
			}
	    });*/
	    
	    //numbers.forEach((Integer value) -> System.out.print(" "+value));
		//numbers.forEach((value) -> System.out.print(" "+value));
		//numbers.forEach(value -> System.out.print(" "+value));
		numbers.forEach(System.out::print);
	  }
}
