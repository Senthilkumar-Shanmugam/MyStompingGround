package com.practise.sorting;

public class SelectionSort {

	public static void main(String[] args) {
       int input[]={14,33,27,20,35,19,42,44};
       display(input);
       sort(input);
       System.out.println("After sorting");
       display(input);
	}
	
	/**
	 * Initially the sorted arr is empty, unsorted is full
	 * for each pass moves the smallest from the unsortedto left
	 * of sorted
	 * @param a
	 */
	private static void sort(int []a){
		int len=a.length;
		int minp;
		for(int i=0;i<len-1;i++){
			minp=i; //starting elem of unsorted arr 
			for(int j=i+1;j<len-1;j++){ // finds the smallest from unsorted
				if(a[minp]>a[j])
					minp=j;
			}
			//swap to the left
			if(i !=minp){
				int tmp = a[i];
				a[i] = a[minp];
				a[minp] = tmp;
			}
		}
	}
	
	private static void display(int[] a){
		for(int i:a)
			System.out.print(" "+i);
	}

}
