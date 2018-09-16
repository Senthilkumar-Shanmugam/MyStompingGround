package com.practise.concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class CountDownLatchDemo1 {

	public static void main(String[] args) {
		List<String> outputScraper = Collections.synchronizedList(new ArrayList<>());
		CountDownLatch latch = new CountDownLatch(5);
		List<Thread> workers = Stream.generate(() -> new Thread(new Worker(outputScraper, latch))).limit(5).collect(toList());
		
		workers.forEach(Thread::start);
		latch.await();
				
	}

}


class Worker implements Runnable{
   private List<String> ouputScraper;
   private CountDownLatch countDownLatch;
   
   public Worker(List<String> outputScraper, CountDownLatch countDownLatch) {
	  this.ouputScraper = outputScraper;
	  this.countDownLatch = countDownLatch;
   }

	@Override
	public void run() {
      try {
		TimeUnit.NANOSECONDS.sleep(1000);
		ouputScraper.add("Counted Down");
		countDownLatch.countDown();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
	}
}