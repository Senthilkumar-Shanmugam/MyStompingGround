package com.practise.problems.string;

/**
 * Joseph and Jane are making a contest for apes. During the process, they have
 * to communicate frequently with each other. Since they are not completely
 * human, they cannot speak properly. They have to transfer messages using
 * postcards of small sizes. To save space on the small postcards, they devise a
 * string compression algorithm:
 * 
 * If a character, , occurs times in a row, then it will be represented by ,
 * where is the value of . For example, if the substring is a sequence of 'a'
 * ("aaaa"), it will be represented as "a4".
 * 
 * If a character, , occurs exactly one time in a row, then it will be simply
 * represented as . For example, if the substring is "a", then it will be
 * represented as "a".
 * 
 * Help Joseph to compress a message, msg.
 * 
 * Input
 * 
 * The only line of input contains a string, msg.
 * 
 * Output
 * 
 * Print the string msg as a compressed message
 * 
 * @author seshshan
 *
 */

public class StringCompression {

	public static void main(String[] args) {
		System.out.println("compressed string>>" + compressString("aaabaaaaccaaaaba"));
	}
    //alternative simple solution.. use hashtable. key..char value. count
	private static String compressString(String inp) {
		StringBuffer result = new StringBuffer();
		char lastchar = ' ';
		int c = 0;
		for (int i = 0; i < inp.length(); i++) {

			// check the last char if result string is same as current,if not
			// add it
			int reslen = result.length();
			if(reslen > 0)
			 lastchar = result.toString().charAt(reslen - 1);
			
			char currChar = inp.charAt(i);
			if ( reslen== 0 ||  lastchar != currChar) {
				if (c > 0) {
					result.append((c+1));
					c = 0;
				}
				result.append(inp.charAt(i));

			} else {
				c++;
			}
		}
         if(c>0)
        	 result.append((c+1));
		return result.toString();
	}
}
