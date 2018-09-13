package com.practise.sorting;

public class MergeSort {
	public static void main(String []a){
		  int input[]={14,33,27,20,15};//,35,19,42,44};
	      display(input);
	      sort(input);
	      System.out.println("\nAfter sorting");
	      display(input);
	}
	private static void sort(int []a){
		divide(a,0,a.length-1);
	}

	private static void divide(int []a,int start,int end){
		if(start==end) return;
		int mid = (start+end)/2;
		divide(a,start,mid);
		divide(a,mid+1,end);
		merge(a,start,mid,end);
	}
	private static void merge(int a[],int start,int mid,int end){
		int dummy=0;
		System.out.println(dummy);
		
		int L[]= new int[mid-start+1];
		int R[]= new int[end-mid];
		
		//copy to temp arrays
		for(int i=start,j=0;j<L.length;i++)
			L[j++]=a[i];
		
		for(int i=mid+1,j=0;j<R.length;i++)
			R[j++]=a[i];
		
		int k=start;
		int i=0,j=0;
		while(i<L.length && j<R.length){
			if(L[i] < R[j]){
				a[k++]=L[i];
			    i++;
			}else{
				a[k++]=R[j];
				j++;
			}
		}
		
		//copy the remaining elements if anything left 
		
		while(i<L.length)
			a[k++]=L[i++];
		
		while(j<R.length)
			a[k++]=R[j++];
		dummy=100;
	}
	
	private static void display(int[] a){
		for(int i:a)
			System.out.print(" "+i);
	}
	}


