package com.learn.algorithms;

public class FibonocciOptimizedBottomUp {
	
	    //This is building fibonocci series strating from f(0)
		// Table is build one by one from bottom up
		private static int fibTabulation(int n){
			int fib[]= new int[n+1];
			fib[0]=0;
			fib[1]=1;
			
			for(int i=2;i<=n;i++){
				fib[i]=fib[i-1]+fib[i-2];
			}
			return fib[n];
		}
		
		
		public static int optimizedBottomUp(int n){
			if(n==0)
				return 0;
			
			int a = 0;
			int b = 1;
			
			for(int i=2;i<n;i++){
				int c = a + b;
				a = b;
				b = c;
			}
			
			return a+b;
		}

	public static void main(String[] args) {
		System.out.println("Fibonacci:"+fibTabulation(4));
		System.out.println("Fibonacci:"+optimizedBottomUp(4));
	}

}
