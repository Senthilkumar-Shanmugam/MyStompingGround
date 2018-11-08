package com.learn.algorithms.sort;

import java.lang.reflect.Array;

public class CountingSort {

	public static void main(String[] args) {
		 int input[]={9,4,1,7,9,1,2,0};
			//int [] input = {19,22,63,105,2,46};
			 //int input[]= {10,80,30,90,40};
		      display(input);
		      countsort(input,0,9);
		   
	}
	
	private static void countsort(int []arr,int minVal,int maxVal) {
		int len = arr.length;
		//create count array
		int [] count = new int[(maxVal-minVal)+1];
		
		//create count array
		for(int i=minVal;i<=maxVal;i++) {
			count[i]=0;
		}
		
		System.out.println("\nCreated Count array:");
		display(count);
		//Build count array with count.. create count(occurence of each elements in source array).
		for(int i=0;i<len;i++) {
			count[arr[i]]++;
		}
		
		System.out.println("\nCount array filled:");
		display(count);
		
		//accumulate count array
		for(int i=1;i<count.length;i++)
			count[i]=count[i]+count[i-1];
		
		System.out.println("\nCount array accumulation:");
		display(count);
		//shift array right once
		
		for(int j=count.length-1;j>0;j--) {
			count[j]=count[j-1];
		}
		count[0]=0;
		
		System.out.println("\nCount array shifted:");
		display(count);
		
		int sortedarr[] = new int[len];
		
		//final step.1.Iterate the original array
		//2. for each value i go to index i in count array. get that value which will be index of value i in sorted array
		// increment value at index i in count array by 1 .. to handle duplicate values
		for(int i=0;i<arr.length;i++) {
			//sortedarr[count[arr[i]]++]=i;
			 sortedarr[count[arr[i]]]=arr[i];
			 count[arr[i]]++;
		}
		
		System.out.println("\n Sorted array");
		display(sortedarr);
	}

	private static void display(int[] a){
		for(int i:a)
			System.out.print(" "+i);
	}
}
