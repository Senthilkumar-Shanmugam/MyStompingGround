package com.practise.sorting;

/**
 * woeks by brining the an elemt to its proper position
 * @author seshshan
 *
 */
public class InsertionSort {
	public static void main(String []a){
	  int input[]={14,33,27,20,35,19,42,44};
      display(input);
      sort(input);
      System.out.println("\nAfter sorting");
      display(input);
}
private static void sort(int []a){
	int len=a.length;
	
	//start from index 2
	for(int curr=1;curr<len;curr++){
		int key = a[curr];
		int j=curr-1;//starting last of sorted array
		 //if curr elem is less than curr in sorted , move one pos to right
		while(j>=0 && a[j]>key){
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
}

private static void display(int[] a){
	for(int i:a)
		System.out.print(" "+i);
}
}
