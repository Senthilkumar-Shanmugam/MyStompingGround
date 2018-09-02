package main.java.com.learn.algorithms;

public class MemoizationFibo {
	private static void  fiboIterative(int n){
        int a[] = new int[n+1];
        
        a[0]=0;
        a[1]=1;
        
        System.out.println("Step 0: 0");
        System.out.println("Step 1: 1");
        for(int i=2; i<=n; i++){
            a[i] = a[i-1] + a[i-2];
            System.out.println("Step "+i+": "+a[i]);
        }
        System.out.println("Array size --> "+a.length);
		
	}

	private static int recursiveFib(int n){
		if(n<=0)
			return 0;
		else if(n==1)
			return 1;
		else
			return recursiveFib(n-1)+recursiveFib(n-2);
	}
	
	//This is top down approach..starting from the top and spliting to the level of base case
	// In memoization table is filled on demand
	private static int fibMemoization(int n){
		//declare a table for storing already calculated values
		int memo[]=new int[n+1];
		
		if(n<=0)
			return 0;
		else if(n==1)
			return 1;
		else if(memo[n] != 0)
			return memo[n];
		else{
			memo[n] =  fibMemoization(n-1)+fibMemoization(n-2);
			return memo[n];
		}
	}
	
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
	

	public static void main(String[] args) {

	    //fiboIterative(40);
		  long preTime=System.nanoTime();
		 // System.out.println("Value of 25th number in fibonacci series->"+recursiveFib(4));
		 // System.out.println("using memoization>>"+fibMemoization(6));
		  System.out.println("using memoization>>"+fibTabulation(6));
		  long postTime=System.nanoTime();
		  System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));
	}

}
