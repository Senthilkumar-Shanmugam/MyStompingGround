package com.example.java8;

@FunctionalInterface
interface Conversion{
	String convert(Integer number);	
}
public class FunctionalInterface2 {
	public static void main(String... arg) {
		
       convert(100,(x) -> String.valueOf(x));
       convert(100, String::valueOf);
       
       Conversion a = (x) -> String.valueOf(x);
       Conversion b = String::valueOf;
		
	}
	
	public static String convert(Integer number,Conversion function) {
		return function.convert(number);
	}

}
