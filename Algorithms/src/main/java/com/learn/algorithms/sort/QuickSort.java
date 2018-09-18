package com.learn.algorithms.sort;

public class QuickSort {
	public static void main(String []a){
		  int input[]={14,33,27,20,35,19,42,44};
	      display(input);
	      quicksort(input,0,input.length-1);
	      System.out.println("\nAfter sorting");
	      display(input);
	}

	private static void quicksort(int []items,int leftIndex,int rightIndex){
		int pivotIndex;
		
		//if the partitioned subarray has been reduced to one element, there is no need to continue
		if(items.length > 1){
			//partition the list(leftIndex ..rightIndex)..find pivot and rearrange with respect to the pivot
			pivotIndex = partition(items,leftIndex,rightIndex);
		    System.out.println("pivot element is :"+items[pivotIndex]);
		    
		    //now recursively continue finding pivot, rearranging the two halves we have
		    if(leftIndex < pivotIndex-1)
		    	quicksort(items,leftIndex,pivotIndex-1);
		    
		    if(rightIndex > pivotIndex)
		    	quicksort(items,pivotIndex,rightIndex);
		}
		
	}
	
	private static int partition(int []items,int leftIndex,int rightIndex){
		System.out.println("Inside partition");
		int pivot = items[(leftIndex+rightIndex)/2];
		System.out.println("Left: "+leftIndex+" Pivot: "+pivot+" Right: "+rightIndex);
		
		//once the left is greater than right, we have finshed sorting with respect to pivot
		// all left to the pivot are lesser than the pivot.. on the right of pivot are higher
		//else compare and rearrange the elements with respect to pivot
		
		while(leftIndex<=rightIndex){
			
			while(items[leftIndex]<pivot)
				leftIndex++;
			
			while(items[rightIndex]>pivot)
				rightIndex--;
			
			// swap their positions since both of them are out of order
			swap(items,leftIndex,rightIndex);
			//move the left and right pointers
			leftIndex++;
			rightIndex--;
		  		
		   }
		    System.out.println(" value of left index:"+leftIndex);
     		return leftIndex;//this the nothing but the position we started the method with
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
