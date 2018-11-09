package com.learn.algorithms.sort;

import java.util.Arrays;

public class SortCharsUsingCountSort {

	public static void main(String[] args) {
		char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o', 
                'r', 'g', 'e', 'e', 'k', 's'
                }; 

    countsort(arr);
    System.out.print("Sorted character array is "); 
    for (int i=0; i<arr.length; ++i) 
        System.out.print(arr[i]);
	}

	private static void countsort(char[] arr) {
       int len = arr.length;
       char output[] = new char[len];
       
       int count[] = new int[256];//8 bit,extended ASCII charset range
       
       Arrays.fill(count, 0);
       
       for(int i=0;i<len;i++) {
    	   count[arr[i]]+=1;
       }
       
       //accumulate
       for(int i=1;i<256;i++) {
    	   count[i]=count[i]+count[i-1];
       }
       
       //build the output array,doing it in reverse so as to make it stable
       for(int i=len-1;i>=0;i--) {
    	   output[count[arr[i]]-1] = arr[i];
    	   count[arr[i]]-=1;
       }
       
    // Copy the output array to arr, so that arr now 
       // contains sorted characters 
       for (int i = 0; i<len; ++i) 
           arr[i] = output[i]; 
       
	}

}
