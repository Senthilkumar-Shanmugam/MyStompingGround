package com.practise.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample2 {

	public static void main(String[] args) {
		  System.out.println("Inside : " + Thread.currentThread().getName());

	        System.out.println("Creating Executor Service...");
	        
	        ExecutorService executorService = Executors.newSingleThreadExecutor();
	        
	        System.out.println("Creating a Runnable...");

	        Runnable runnable1 = () -> {
	            System.out.println("TAsk: " + Thread.currentThread().getName());
	            try {
	            	TimeUnit.SECONDS.sleep(2);
   				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            System.out.println("TAsk: completed");

	        };
	        Runnable runnable2 = () -> {
	            System.out.println("TAsk: " + Thread.currentThread().getName());
	            try {
	            	TimeUnit.SECONDS.sleep(2);
   				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            System.out.println("TAsk: completed");

	        };
	        Runnable runnable3 = () -> {
	            System.out.println("TAsk: " + Thread.currentThread().getName());
	            try {
	            	TimeUnit.SECONDS.sleep(2);
   				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            System.out.println("TAsk: completed");

	        };
	        System.out.println("Submit the task specified by the runnable to the executor service.");
	         executorService.submit(runnable1);
	         executorService.submit(runnable2);
	         executorService.submit(runnable3);

	         
	         executorService.shutdown();

	}

}
