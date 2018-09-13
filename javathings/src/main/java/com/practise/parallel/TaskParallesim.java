package com.practise.parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class TaskParallesim {
	
	private static void seqArraySum(int []arr){
		long start = System.nanoTime();
		int sum1 = 0;
		int sum2 = 0;
		
		//compute the sum of lower half of the array
		for(int i=0; i< arr.length/2;i++)
			sum1+=arr[i];
		
		//compute the sum of the upper half of the array
		for(int i=arr.length/2; i< arr.length;i++)
			sum2+=arr[i];
		
		//combine sum
		int sum = sum1 + sum2;
		
		long end = System.nanoTime();
		
		System.out.println(" seq Arr sum completed in:"+(end-start)+" milliseconds "+
		             "with sum>>"+sum);
		
	}
	private static void parArraySum(int []arr){
		long start = System.nanoTime();
		SumArray task = new SumArray(arr,0,arr.length);
		ForkJoinPool.commonPool().invoke(task);
		int sum = task.sum;
		long end = System.nanoTime();
		
		System.out.println(" parArr sum completed in:"+(end-start)+" milliseconds "+
		             "with sum>>"+sum);

	}
	
	private static class SumArray extends RecursiveAction{
		static int SEQUENTIAL_THRESHOLD = 3;
		int lo,hi,sum;
		int [] arr;
		
		SumArray(int []arr,int l, int h){
			lo = l;
			hi = h;
			this.arr = arr;
		}
		
		protected void compute(){
			if(hi-lo <= SEQUENTIAL_THRESHOLD){
				for(int i = lo ; i< hi;i++)
					sum += arr[i];
			}else{
				SumArray LeftSum = new SumArray(arr,lo,(hi+lo)/2);
				SumArray RightSum = new SumArray(arr,(hi+lo)/2,hi);
				
				LeftSum.fork();
				RightSum.compute();
				LeftSum.join();
				sum = LeftSum.sum + RightSum.sum;
			}
		}
		
	}
	

	public static void main(String[] args) {
	   int []input ={10,23,34,12,15,56,26,10,23,34,12,15,56,26,10,23,34,12,15,56,26};
	   System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","4");
	   for(int i=0;i<3;i++){
       seqArraySum(input);
       parArraySum(input);
	   }
	}

}
