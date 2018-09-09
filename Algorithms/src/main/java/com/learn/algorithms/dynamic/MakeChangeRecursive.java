package com.learn.algorithms.dynamic;

public class MakeChangeRecursive {
	
	public static int noOfWays(int []coins,int balance,int index){
		if(balance==0) return 1;
		if(balance < 0 ) return 0;
		else if(index>coins.length-1 && balance > 0)
			return 0;
		else
			return noOfWays(coins,balance-coins[index],index)+noOfWays(coins,balance,index+1);
	}

	public static void main(String[] args) {
		int [] coins = {1,2,3};
		int amount = 5;
  
		System.out.println(noOfWays(coins,amount,0));
	}

}
