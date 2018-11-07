package com.practise.java8.patterns;

import java.util.Random;

public class RandomGeneration {

	public static void main(String[] args) {
      
		for(int i=1;i<10;i++)
			System.out.println(randomNumberBetween(0, 10));
		
	}
	
	public static int randomNumberBetween(int startIndex,int endIndex) {
		 return (int) Math.floor(Math.random()*(endIndex-startIndex+1)+startIndex);
/*		 Random r = new Random();
		 return r.nextInt((endIndex-startIndex));*/
	 }

}
