package com.learn.algorithms;

import java.util.Scanner;

public class DecimalToGivenRadix {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a decimal number");
       int num = in.nextInt();
       System.out.println("Enter the radix");
       int radix = in.nextInt();
       convertFromDecimalToGivenRaidx(num,radix);
	
	}
	
	private static void convertFromDecimalToGivenRaidx(int num, int radix) {
	    int output = 0;
		int base = 1;
		
		while(num>0) {
			int rem = num % radix;
			num /= radix;
			output += (rem * base);
			base *= 10;
		}
		System.out.printf("Converted from decimal to radix %d = %d",radix,output);
	}

}
