package com.learn.backtracking;

import java.util.Scanner;

public class PractiseStringPermutation {

	public static void main(String[] args) {
       System.out.println("Enter the String to permute");
       Scanner in = new Scanner(System.in);
       String inp = in.next();
       permute(inp);
	}

	private static void permute(String inp) {
		permuteHelper(inp, "");
	}
	
	private static void permuteHelper(String s,String chosen) {
		if(s.isEmpty()) {//base case whittle down 
			System.out.println(chosen);
		}else {
			//choose/explore/unchoose
			// choose 1 letter from the remaining,explore the rest
			for(int i=0;i<s.length();i++) {
				//choose
				char c = s.charAt(i);
				//explore
				//permuteHelper(s., chosen+c);
				
			}
			
		}
			
			
	}

}
