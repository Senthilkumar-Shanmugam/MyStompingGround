package com.practise.forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class ArrayTransform extends RecursiveAction{
	int [] array;
	int number;
	int threshold = 100_000;
	int start;
	int end;
	
	public ArrayTransform(int[] array, int number, int start, int end) {
		this.array = array;
        this.number = number;
        this.start = start;
        this.end = end;
	}

	@Override
	protected void compute() {
	 if (end-start < threshold)
		 computeDirectly();
	 else {//divide the problem 
		 int mid = (end+start)/2;
		 ArrayTransform subTask1 = new ArrayTransform(array, number, start, mid);
		 ArrayTransform subTask2 = new ArrayTransform(array,number,mid+1,end);
		 invokeAll(subTask1,subTask2);
	 }
		
	}
	protected void computeDirectly() {
	 for (int i = start; i < end; i++) {
		array[i] = array[i] * number;
     }
	}
	
}

public class RecursiveActionExample1 {
	static final int SIZE = 10_000_000;
	static int[] array = randomArray();


	public static void main(String[] args) {
	  int number = 9;
		
	  System.out.println("First 10 elements of the array before: ");
	  print();
	  ArrayTransform mainTask = new ArrayTransform(array, number, 0, SIZE);
      ForkJoinPool pool = new ForkJoinPool();
	  pool.invoke(mainTask);
	  System.out.println("First 10 elements of the array after: ");
	  print();

}
	 static int[] randomArray() {
	        int[] array = new int[SIZE];
	        Random random = new Random();
	 
	        for (int i = 0; i < SIZE; i++) {
	            array[i] = random.nextInt(100);
	        }
	 
	        return array;
	    }
	 
	    static void print() {
	        for (int i = 0; i < 10; i++) {
	            System.out.print(array[i] + ", ");
	        }
	        System.out.println();
	    }
}
