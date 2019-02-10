package com.example.java8;

import java.util.Locale;
import java.util.function.BiFunction;

/**
 * This example constructor takes two arguments, making use of BiFunction
 * functional interface
 * 
 * @author seshshan
 *
 */
public class ConstructorMethodReference2 {

	public static void main(String[] args) {
     
		//anonymous class approach
		
		BiFunction<String,String,Locale> f1 = new BiFunction<String,String,Locale>(){
			@Override
			public Locale apply(String lang, String country) {
				return new Locale(lang,country);
			}
		};
          Locale l1 = f1.apply("en", "UK");
          
          //using lambda expression
         BiFunction<String,String,Locale> f2 = (lang,country) -> new Locale(lang,country);
         Locale l2 = f2.apply("en", "UK");
         
         //using  constructor method reference
         BiFunction<String,String,Locale> f3 = Locale::new;
		Locale l3 = f3.apply("en", "UK");
	}

}
