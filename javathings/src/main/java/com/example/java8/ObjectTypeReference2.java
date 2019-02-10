package com.example.java8;

interface TriFunction<T,U,V,R>{
	R apply(T t,U u, V v);
}

class Sum{
	Integer doSum(String s1,String s2) {
		return Integer.parseInt(s1) + Integer.parseInt(s2);
	}
}

public class ObjectTypeReference2 {

	public static void main(String[] args) {
        //anonymous class
		TriFunction<Sum,String,String,Integer> anon = 
				new TriFunction<Sum,String,String,Integer>(){
					@Override
					public Integer apply(Sum t, String u, String v) {
                        return t.doSum(u, u);
					}
		};
		
		
		//Lambda expression,see the types are omitted
		TriFunction<Sum,String,String,Integer> lambda = (s,s1,s2) -> s.doSum(s1, s2);
		System.out.println("sum:"+ lambda.apply(new Sum(), "10", "11"));
		
		//method Reference, no arguments
		TriFunction<Sum,String,String,Integer> mRef = Sum::doSum;
		System.out.println("sum:"+ mRef.apply(new Sum(), "10", "11"));

	}
}
