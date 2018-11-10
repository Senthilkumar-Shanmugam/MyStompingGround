package com.algorithms.sorting;

import java.util.Arrays;

public class RadixSort {
	// A utility function to print an array 
    static void print(int arr[], int n) 
    { 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    } 
  
  
    /*Driver function to check for above function*/
    public static void main (String[] args) 
    { 
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66}; 
        int n = arr.length; 
        radixsort(arr, n); 
        print(arr, n); 
    }

    // A utility function to get maximum value in arr[] 
    static int findMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 


	private static void radixsort(int[] arr, int n) {
       		int m = findMax(arr,n); //to know the number of digits
       		
       		//sort the array starting from least significant digit to most significant
       		
       		for(int place=1;m/place>0 ;place*=10) {
       			countsort(arr,place);
       		}
       		
	} 
	
	private static int getDigit(int number,int digitPlace) {
		return ((number/digitPlace)%10);
	}
	
	private static void countsort(int []arr,int place) {
		int len = arr.length;
		int sortedarr[] = new int[len];

		int count[] = new int[10]; //for radix(base) 10
		
		Arrays.fill(count, 0);
		
		//Build count array with count.. create count(occurence of each elements in source array).
		for(int i=0;i<len;i++) {
			//count[arr[i]]++;
			int digit = getDigit(arr[i],place);
			count[digit] += 1;
		}
		
		//accumulate count array. to get the actual position of val in sorted array
		for(int i=1;i<count.length;i++)
			count[i]+=count[i-1];
		
		for(int i=len-1;i>=0;i--) {
	    	 sortedarr[count[arr[i]]-1] = arr[i];
	    	 count[arr[i]]-=1;
	      }
		
		System.out.println("\n Sorted array");
		print(sortedarr,sortedarr.length);
	}
}
