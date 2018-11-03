package com.learn.string;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class StringPermutation {

	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
	   System.out.println("Enter the input string");
	   String inp = in.next();
       permutation(inp);
 	}
	
	private static void permutation(String str) {
		permutation(str,"");
	}

	private static void permutation(String str, String prefix) {
        if(str.length() == 0)
        	System.out.println(prefix);
        else
        {
        	for(int i=0;i<str.length();i++) {
        		String rem = str.substring(0,i)+str.substring(i+1);
        		permutation(rem,prefix+str.charAt(i));
        	}
        }
	}

}
