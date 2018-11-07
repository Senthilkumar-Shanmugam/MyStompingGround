package com.learn.algorithms.sort;

public class QuickSortMiddlePivot {
	public static void main(String []a){
		 // int input[]={14,33,27,20,35,19,42,44};
		//int [] input = {19,22,63,105,2,46};
		 int input[]= {10,80,30,90,40};
	      display(input);
	      quicksort(input,0,input.length-1);
	      System.out.println("\nAfter sorting");
	      display(input);
	}

	private static void quicksort(int []items,int leftIndex,int rightIndex){
		System.out.println("\n QuickSort: <<LeftIndex>>"+leftIndex+" <<rightIndex>> "+rightIndex);
		int pivotIndex;
		
		//if the partitioned subarray has been reduced to one element, there is no need to continue
		if(items.length > 1){
			//partition the list(leftIndex ..rightIndex)..find pivot and rearrange with respect to the pivot
			//pivotIndex = partition(items,leftIndex,rightIndex);
			pivotIndex = LastElementAsPivot(items, leftIndex, rightIndex);
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
		
		//once the left is greater than right, we have finished sorting with respect to pivot
		// all left to the pivot are lesser than the pivot.. on the right of pivot are higher
		//else compare and rearrange the elements with respect to pivot
		
		while(leftIndex<rightIndex){
			
			while(items[leftIndex]<pivot){ //keep moving forward the left as long as items on the left is lesser than the pivot
				leftIndex++;
              System.out.println("left index is pointing at:"+items[leftIndex]);
			}
			
			while(items[rightIndex]>pivot){//keep moving the right as long as items on the right of pointer is greater than the pivot
				rightIndex--;
			    System.out.println("right index is pointing at:"+items[rightIndex]);	
			}
			
			//Now left and right have stopped at locations(indices) where they are out of order,now 
			// need to be swapped only left has not passed over right
			
			System.out.printf(" \n Now both left and rigt pointers are at:%d,%d",leftIndex,rightIndex);
			if(leftIndex <= rightIndex){
				System.out.printf(" \n swapping elements at indices %d <--> %d",leftIndex,rightIndex);
				swap(items,leftIndex,rightIndex);
				System.out.println();
				display(items);
				System.out.println();
			    //move the left and right pointers after the swap because elements on that indices are in order now.. move on to the next
				leftIndex++;
				rightIndex--;
		    }
		  }
		    System.out.println(" \n value of left index(new pivot index):"+leftIndex);
   		return leftIndex;//this the nothing but the position we started the method with
   	}
	
	private static int LastElementAsPivot(int[] arr,int leftIndex,int rightIndex) {
		int pivot = arr[rightIndex];
		
		int end = rightIndex - 1;
		while(leftIndex< end) {
			while(arr[leftIndex] < pivot)
				leftIndex++;
			
			while(arr[end]>pivot)
				end --;
			
			if(leftIndex<end) {
				swap(arr,leftIndex,end);
				leftIndex++;
				end --;
			}
		}
		//now swap the pivot with left
		swap(arr,leftIndex,rightIndex);
		return leftIndex;
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