package com.learn.arrays;

import java.util.Scanner;

public class SumTheDigits {

	public static void main(String[] args) {
       System.out.println("Enter the digit");
       Scanner in = new Scanner(System.in);
       int digit = in.nextInt();
        
       int sum = 0;
       
       while(digit>0) {
    	   sum += digit%10;
    	   digit/=10;
       }
       System.out.println("Sum of the digits>>"+sum); 
	}

}
