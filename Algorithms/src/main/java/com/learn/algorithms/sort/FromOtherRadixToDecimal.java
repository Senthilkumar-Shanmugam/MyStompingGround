package com.learn.algorithms.sort;

import java.util.Scanner;

public class FromOtherRadixToDecimal {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the number");
       int num = in.nextInt();
       System.out.println("Enter the radix(base) of that number");
	   int radix = in.nextInt();
	   int decimal = 0;
	   int base = 1; // least significant digit radix raised to the power is always 0
	  
	  while(num>0) {
		  int last_digit = num%10;
		  num /= 10;
		  decimal += (last_digit*base);
		  base *= 2;
	  }
	  System.out.println("Decimal Value is >>"+decimal);
	}

}
