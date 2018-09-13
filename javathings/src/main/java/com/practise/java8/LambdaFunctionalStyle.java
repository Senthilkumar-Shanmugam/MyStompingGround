package com.practise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.omg.Messaging.SyncScopeHelper;


public class LambdaFunctionalStyle {

	public static void main(String[] args) {
       List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       
       //External iterators
       
       //familiar and complex
       // for(int i = 0; i < numbers.size(); i++) {
       //   System.out.println(numbers.get(i));
       // }
                 
       //familiar and simpler than the previous one
       // for(int e : numbers) {
       //   System.out.println(e);
       // }

       
       //Internal Iterators
       /*numbers.forEach(new Consumer<Integer>(){
		@Override
		public void accept(Integer t) {
           System.out.println(t);			
		}
       });*/
       
       //Lamda style ,functiona style, anonymous functions, only body and paramters,
       //return type is inferred from the context
     //  numbers.forEach((Integer e) -> System.out.println(e));	
       
       //Removing type, type is inferred
       
      // numbers.forEach((e) -> System.out.println(e));
       
       //numbers.forEach(e -> System.out.println(e));

         numbers.forEach(System.out::println);
	}

}
