package com.practise.concurrency;

/**
 * sample class testing if join releases resources its holding
 * before going into wait state
 * @author seshshan
 *
 */
public class DoesJoinReleaseResource extends Thread{
    static DoesJoinReleaseResource thread1;
    
    public void run(){
    	try{
    		synchronized (thread1) {
    			System.out.println(Thread.currentThread().getName()+" acquired a lock on thread1");
    			Thread.sleep(5000);
    			System.out.println(Thread.currentThread().getName()+" completed");
			}
    		
    	}catch(InterruptedException e){
    		
    	}
    }
	public static void main(String[] args) throws InterruptedException {
		thread1 = new DoesJoinReleaseResource();
		thread1.setName("thread1");
		thread1.start();
		
		synchronized(thread1){//acquires same lock
		System.out.println(Thread.currentThread().getName()+" acquired a lock on thread1");
		Thread.sleep(1000);
		thread1.join(); //current thread joins and waits till thread 1 completes, inlcude
		    //lock thread1
		System.out.println(Thread.currentThread().getName()+" completed");
        }
	}

}
