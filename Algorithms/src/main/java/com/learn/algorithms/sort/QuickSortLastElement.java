package com.learn.algorithms.sort;

public class QuickSortLastElement {

	public static void main(String[] args) {
		  int input[]={14,33,27,20,35,19,42,44};
			//int [] input = {19,22,63,105,2,46};
		      display(input);
		      quicksort(input,0,input.length-1);
		      System.out.println("\nAfter sorting");
		      display(input);
		
	}
	
	 private static void quicksort(int []arr,int leftIndex,int rightIndex) {
		 if(leftIndex<rightIndex) {
			 int pIndex = partition(arr,leftIndex,rightIndex);
			 quicksort(arr, leftIndex, pIndex-1);
			 quicksort(arr, pIndex+1, rightIndex);
		 }
	 }
	 
	 private static int partition(int []arr,int leftIndex,int rightIndex) {
		 int pivot = arr[rightIndex];
		 
		 int pIndex = leftIndex;
		 
		 for(int i=leftIndex;i<rightIndex;i++) {
			 if(arr[i]<=pivot) { //move until you find an element that's out of order. greater than pivot. else swap with lesser with previous ooindex
				 swap(arr,i,pIndex);
				 pIndex++;
			 }
		 }
		 swap(arr,pIndex,rightIndex);
		 
		 return pIndex;
    	 
	 }
	
	 private static void swap(int []items,int indexOne,int indexTwo){
	  	 int tmp = items[indexTwo];
	  	 items[indexTwo] = items[indexOne];
	  	 items[indexOne] = tmp;
	   }
		   
		
		private static void display(int[] a){
			for(int i:a)
				System.out.print(" "+i);
		}
}
