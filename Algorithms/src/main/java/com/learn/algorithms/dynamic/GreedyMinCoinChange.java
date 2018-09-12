package com.learn.algorithms.dynamic;

public class GreedyMinCoinChange {

	public static void main(String[] args) {
		int deno[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
		int amount = 93;
  
		System.out.println(findMinChnage(deno,amount));
	}

	private static String findMinChnage(int[] deno, int amount) {
		StringBuffer ans = new StringBuffer();
		
		int i = deno.length - 1;
		
		while(i>=0){
			while(amount >= deno[i]){
				amount = amount - deno[i];
				ans.append(deno[i]+",");
			}
			i--;
		}
		return ans.toString();
	}

}
