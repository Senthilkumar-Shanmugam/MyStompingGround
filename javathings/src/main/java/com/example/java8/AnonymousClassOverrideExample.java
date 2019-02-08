package com.example.java8;



public class AnonymousClassOverrideExample {

	public static void main(String[] args) {
       System.out.println("inside main");
       
       useExpriment(new Expriment() {

		@Override
		public void method1() {
         System.out.println("inside method1");			
		}

		@Override
		public void method2() {
         System.out.println("inside method2");			
		}});
	}
	
	public static void useExpriment(Expriment exp) {
		exp.method1();
		exp.method2();
	}
	
}

//@FunctionalInterface
interface Expriment{
	void method1();
	void method2();
}
