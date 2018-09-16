package com.practise.concurrency;

import java.util.concurrent.TimeUnit;

public class ThreadSequencePrint {
	 volatile char printVal='A';//signal what is next to be printed
	 
	 ThreadSequencePrint(){}
	
	
	public static void main(String[] args) {
		ThreadSequencePrint obj = new ThreadSequencePrint();
		PrintThreadA threadA = new PrintThreadA(obj);
		PrintThreadB threadB = new PrintThreadB(obj);
		PrintThreadC threadC = new PrintThreadC(obj);
		threadA.start();
		threadB.start();
		threadC.start();
	}

}

class PrintThreadA extends Thread {
	ThreadSequencePrint printObj = null;

	PrintThreadA(ThreadSequencePrint printObj) {
		this.printObj = printObj;
	}

	@Override
	public void run() {
		try {
			print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private void print() throws InterruptedException{
			synchronized (printObj) {
				 //TimeUnit.SECONDS.sleep(10);
				for(int i=1;i<=3;i++)
				{
				  while(printObj.printVal != 'A') // its not its turn to run, so give up lock and go waiting
					 //System.out.println("Inside :"+Thread.currentThread().getName()+" goes waiting");
				    printObj.wait();
				 
					 //System.out.println("Inside :"+Thread.currentThread().getName()+" printing");
					 System.out.print(" A ");
					 printObj.printVal='B';
					 printObj.notifyAll();
				 }				
			}
		}
	}


class PrintThreadB extends Thread {
	ThreadSequencePrint printObj = null;

	PrintThreadB(ThreadSequencePrint printObj) {
		this.printObj = printObj;
	}

	public void run() {
		//System.out.println("Inside :"+Thread.currentThread().getName()+ " value>>"+printObj.printVal);

		try {
			print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private void print() throws InterruptedException{
		synchronized (printObj) {
				//TimeUnit.SECONDS.sleep(10);
			for(int i=1;i<=3;i++){
				 while(printObj.printVal != 'B') // its not its turn to run, so give up lock and go waiting
					// System.out.println("Inside :"+Thread.currentThread().getName()+" goes waiting");
				    printObj.wait();
				 
					// System.out.println("Inside :"+Thread.currentThread().getName()+ "printing");
					 System.out.print(" B ");
					 printObj.printVal='C';
					 printObj.notifyAll();
				 }				
			}
		}
	}



class PrintThreadC extends Thread {
	ThreadSequencePrint printObj = null;

	PrintThreadC(ThreadSequencePrint printObj) {
		this.printObj = printObj;
	}

	public void run() {
		//System.out.println("Inside :"+Thread.currentThread().getName()+ " value>>"+printObj.printVal);

		try {
			print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private void print() throws InterruptedException{
			synchronized (printObj) {
				//TimeUnit.SECONDS.sleep(10);
				for(int i=1;i<=3;i++){

				 while(printObj.printVal != 'C')// its not its turn to run, so give up lock and go waiting
					// System.out.println("Inside :"+Thread.currentThread().getName()+" goes waiting");
				    printObj.wait();
				 
					 //System.out.println("Inside :"+Thread.currentThread().getName()+ " printing");
					 System.out.print(" C ");
					 printObj.printVal='A';
					 printObj.notifyAll();
				 }				
			}
		}
	}




