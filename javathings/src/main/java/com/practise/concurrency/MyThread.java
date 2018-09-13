package com.practise.concurrency;

public class MyThread extends Thread{
	//LogFactory test;
	public void run(){
		System.out.println("inside foo");
	}
	
	public void run(String str){
		System.out.println("inside bar");
	}

	public static void main(String[] args) {
        MyThread t = new MyThread(){
        	public void run(){
        		System.out.println("inside anonymous");
        	}
        };
        
        t.start();
	}

}
