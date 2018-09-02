package com.learn.algorithms;

/**
 * Implement an algorithm to check if string conatins chars that are all unique
 * without using additional data structure
 * @author seshshan
 *
 */
public class StringHasUniqueCharacters {

	public static void main(String[] args) {
        // System.out.println(checkStringHasUniqueChar("tesp"));
         
     	String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}

	}

	//brute force.O(N power 2)
	private static boolean checkStringHasUniqueChar(String string) {
		int size = string.length();
		
		for(int i=0;i<size-1;i++)
			for(int j=i+1;j<size;j++)
				if(string.charAt(i)==string.charAt(j))
					return false;
		return true;
	}
	
	//optimized solution.. Time complexity O(N). space complexity O(1)
	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println("val>>"+val);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	

}
