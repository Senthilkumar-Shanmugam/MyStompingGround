package com.learn.algorithms.sort;

import java.util.Random;

public class QuickSortRandomPivotLumoto {
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
			 int pIndex = randomizedPartition(arr,leftIndex,rightIndex);
			 quicksort(arr, leftIndex, pIndex-1);
			 quicksort(arr,pIndex+1,rightIndex);
		 }
	 }
	 
	 public static int randomNumberBetween(int startIndex,int endIndex) {
		 return (int) Math.floor(Math.random()*(endIndex-startIndex+1)+startIndex);
		 /*Random r = new Random();
		 return r.nextInt((endIndex-startIndex)+1)+startIndex;*/
	 }
	 
	 private static int randomizedPartition(int[]arr,int leftIndex,int rightIndex) {
		 int random = randomNumberBetween(leftIndex, rightIndex);
		 swap(arr,random,rightIndex);
		 return partition(arr, leftIndex, rightIndex);
	 }
	 
	 public static int partition(int[] array,int startIndex,int endIndex) {
         int pivotValue = array[endIndex];
         int pivotIndex = startIndex;

         for (int j = startIndex; j < endIndex; j++) {
             if (array[j] <= pivotValue) {
                 swap(array,j,pivotIndex);
                 pivotIndex = pivotIndex + 1;
             }
         }
         swap(array,pivotIndex,endIndex);
         return pivotIndex;
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
