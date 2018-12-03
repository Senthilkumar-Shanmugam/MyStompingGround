package com.learn.algorithms;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a decimal number");
       int num = in.nextInt();
       System.out.println("Enter the radix");
       int radix = in.nextInt();
       convertToBinary(num,radix);
	
	}
	
	private static void convertToBinary(int num, int radix) {
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

	private static void convertToRadix(int num,int radix) {
	       int binary[] = new int[40];

	       int i = 0; 
	       while (num > 0)  
	       { 
	           // storing remainder in binary array 
	           binary[i] = num % 2; 
	           num = num / 2; 
	           i++; 
	       } 
	  
	       // printing binary array in reverse order 
	       for (int j = i - 1; j >= 0; j--) 
	           System.out.print(binary[j]); 
		
	}

}
