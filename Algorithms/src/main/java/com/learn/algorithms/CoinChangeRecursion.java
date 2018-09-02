package com.learn.algorithms;

public class CoinChangeRecursion {
	  public static int total(int amount, int[] coins, int i) {
	      if (amount < 0) {
	        return 0;
	      }
	      if (amount == 0) {
	        return 1;
	      }
	      // means coins over and n>0 so no solution
	      if (i == coins.length && amount > 0) {
	        return 0;
	      }
	      int withCoin = total(amount - coins[i], coins, i);
	      int without = total(amount, coins, i + 1);
	      return withCoin + without;
	    }
	    public static void main(String[] args) {
	      int amount = 5;
	      int[] v = { 1, 2, 3 };
	      System.out.println("By Recursion: " + total(amount, v, 0));
	    }
	}