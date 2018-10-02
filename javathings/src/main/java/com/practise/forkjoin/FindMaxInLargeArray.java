package com.practise.forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class FindMaxTask extends RecursiveTask<Integer>{
	Integer[] largeArray;
	int start;
	int end;
	int threshold;
	

	public FindMaxTask(Integer[] largeArray, int start, int end, int threshold) {
		super();
		this.largeArray = largeArray;
		this.start = start;
		this.end = end;
		this.threshold = threshold;
	}

	@Override
	protected Integer compute() {
		int max=0;
		if(end-start <= threshold) {
			// find the max sequentially
			for(int i=start;i<end;i++)
			 if(largeArray[i]>max)
			  max=largeArray[i];
		}else {// find the max by dividing the array and running the subtasks in parallel
			int mid = start+(end-start)/2;
			
			FindMaxTask left = new FindMaxTask(largeArray, start, mid, threshold);
			FindMaxTask right = new FindMaxTask(largeArray, mid, end, threshold);

			left.fork();
			right.fork();
			
			Integer leftMax = left.join();
			Integer rightmax = right.join();
			
			return (leftMax > rightmax) ? leftMax:rightmax;
		}
		return max;
	}
	
}

public class FindMaxInLargeArray {
	static Integer[] largeArray = randomArray();

	public static void main(String[] args) {
		FindMaxTask initialBigTask = new FindMaxTask(largeArray, 0, largeArray.length, 10);
	    ForkJoinPool pool = new ForkJoinPool();
	    System.out.println("max value >>"+pool.invoke(initialBigTask));

		
	}
	static Integer[] randomArray() {
        Integer[] array = new Integer[10_00];
        Random random = new Random();
 
        for (int i = 0; i < 10_00; i++) {
            array[i] = random.nextInt(35235100);
        }
 
        return array;
    }
 
}
