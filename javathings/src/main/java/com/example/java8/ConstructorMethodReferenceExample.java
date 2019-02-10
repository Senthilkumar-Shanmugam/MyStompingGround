package com.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;


import lombok.Data;

public class ConstructorMethodReferenceExample {

	public static void main(String[] args) {
     //To illustrate constructor method reference we will use Supplier Function Interface
	 //anonymous class
		
	  Supplier<List<String>> s = new Supplier() {
		@Override
		public Object get() {
			return new ArrayList<String>();
		}
		};
		
		List<String> l = s.get();
	
	    //using lambda
		Supplier<List<String>> s2 = () -> new ArrayList<String>();
		s2.get();
		
		//Supplier<List<String>> s3 = Supplier<List::new; needs to be fixed, try another case
		
		//anonymous class
		Function<String,Integer> f = new Function<String,Integer>(){
			@Override
			public Integer apply(String s) {
				return new Integer(s);
			}
		};
		f.apply("100");
		
		
		//using lambda expression
		Function<String,Integer> f2 = (str) -> new Integer(str);
		
		//using Method Reference
		Function<String,Integer> f3 = Integer::new;
		f3.apply("101");
		
	}
}

@Data
class Sample{
	private int value;
}
