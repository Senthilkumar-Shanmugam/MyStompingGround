package com.learn.algorithms.dynamic;

public class MakeChangeRecursive {
	
	public static int noOfWays(int []coins,int balance,int index){
		if(balance==0) return 1; // it it leads to zeo that means the combinations used works
		if(balance < 0 ) return 0; // if it leads to negative .. the combinations didnt work out
		else if(index>coins.length-1 && balance > 0) // we still have balamount. used up all coins
			return 0;
		else //using a deno(one way.. if it leads to zero)+without using that combination
			return noOfWays(coins,balance-coins[index],index)+noOfWays(coins,balance,index+1);
	}

	public static void main(String[] args) {
		int [] coins = {1,2,3};
		int amount = 5;
  
		System.out.println(noOfWays(coins,amount,0));
	}

}
