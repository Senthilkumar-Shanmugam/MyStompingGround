package main.java.com.learn.algorithms;

public class FibonacciIterative {
	
	
	private static int recursiveFib(int n){
		if(n<=0)
			return 0;
		else if(n==1)
			return 1;
		else
			return recursiveFib(n-1)+recursiveFib(n-2);
	}
	
	private static int factorialRecursive(int n){
		if(n==1)
			return 1;
		else
			return n*factorialRecursive(n-1);
	}
	
	private static int factorialIterative(int n){
		int factorial = 1;
		
		while(n>1){
			factorial *= n;
			n=n-1;
		}
	  return factorial;		
	}
	
	private static void  fiboIterative1(int n){
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

	private static int fiboIterative(int n){
		int sum = 0, x=1,y=1;
		
		
		//for(int )
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println("Fibo using rec>>"+recursiveFib(5));
		System.out.println("Factorial recursive:"+factorialRecursive(4));
		System.out.println("Factorial Iterative:"+factorialRecursive(4));
        fiboIterative1(5);

	}

}
