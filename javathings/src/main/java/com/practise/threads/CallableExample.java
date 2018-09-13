package com.practise.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
      System.out.println("Inside >>"+Thread.currentThread().getName());
      
       Callable<String> callable = () -> {
    	   TimeUnit.NANOSECONDS.sleep(10000);
    	   return "callable result";
       };
   
      ExecutorService executor = Executors.newSingleThreadExecutor();
      
      Future<String> future = executor.submit(callable);
      System.out.println("Task submitted");
      
      String result = future.get();
      
      System.out.println(" result from future>>"+result);
      
      executor.shutdown();
	}

}
