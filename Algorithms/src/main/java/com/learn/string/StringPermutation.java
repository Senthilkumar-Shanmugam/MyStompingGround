package com.learn.string;

import java.util.Scanner;

/**
 * Page 63. Cracking coding interviews. Example 12
 * backtracking alogorithm
 * @author seshshan
 *
 */
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
		System.out.println("str>>"+str+" prefix>>"+prefix);
        if(str.length() == 0)
        	System.out.println("Permutation:"+prefix);
        else
        {
        	for(int i=0;i<str.length();i++) {
        		System.err.println(i+":str inside for>>"+str);
        		String one = str.substring(0,i);
        		String two = str.substring(i+1);
        		String rem = one+two;
        		System.out.println("one>>"+one+"<<two>>"+two+"<<rem>>"+rem);
        		permutation(rem,prefix+str.charAt(i));
        	}
        }
	}

}
