package com.learn.algorithms;

import java.util.Scanner;

public class DeimalToBinary {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int binary[] = new int[40];
       System.out.println("Enter a decimal number");
       int num = in.nextInt();
       
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
