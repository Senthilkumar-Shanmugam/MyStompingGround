package com.practise.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSequencePrintUsingLock {
	volatile int printVal = 'A'; 
	public static void main(String[] args) {
		ThreadSequencePrintUsingLock printVal = new ThreadSequencePrintUsingLock();
        final Lock lock = new ReentrantLock();
        Condition Aturn = lock.newCondition();
        Condition Bturn = lock.newCondition();
        Condition Cturn = lock.newCondition();
        
		PrintA threadA = new PrintA(lock,Aturn,Bturn,Cturn,printVal);
		PrintB threadB = new PrintB(lock,Aturn,Bturn,Cturn,printVal);
		PrintC threadC = new PrintC(lock,Aturn,Bturn,Cturn,printVal);
		threadA.start();
		threadB.start();
		threadC.start();
	}

}

class PrintA extends Thread{
	Lock lock;
	Condition conA,conB,ConC;
	ThreadSequencePrintUsingLock printVal;
	
	PrintA(Lock lock,Condition cA,Condition cB,Condition cC ,ThreadSequencePrintUsingLock printVal){
		this.lock=lock;
		this.conA=cA;
		this.conB=cB;
		this.ConC=cC;
		this.printVal=printVal;
	}
	
	@Override
	public void run(){
		try{
			lock.lock();
			
			for(int i=1;i<=3;i++){
				while(printVal.printVal != 'A')
					conA.await();
				
				System.out.print(" A ");
				printVal.printVal='B';
				conB.signal();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
}
class PrintB extends Thread{
	Lock lock;
	Condition conA,conB,ConC;
	ThreadSequencePrintUsingLock printVal;
	
	PrintB(Lock lock,Condition cA,Condition cB,Condition cC,ThreadSequencePrintUsingLock printval){
		this.lock=lock;
		this.conA=cA;
		this.conB=cB;
		this.ConC=cC;
		this.printVal=printval;
	}
	
	@Override
	public void run(){
		try{
			lock.lock();
			for(int i=1;i<=3;i++){
				while(printVal.printVal != 'B')
					conB.await();
				
				System.out.print(" B ");
				printVal.printVal='C';
				ConC.signal();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
}

class PrintC extends Thread{
	Lock lock;
	Condition conA,conB,ConC;
	ThreadSequencePrintUsingLock printVal;
	
	PrintC(Lock lock,Condition cA,Condition cB,Condition cC,ThreadSequencePrintUsingLock printval){
		this.lock=lock;
		this.conA=cA;
		this.conB=cB;
		this.ConC=cC;
		this.printVal = printval;
	}
	
	@Override
	public void run(){
		try{
			lock.lock();
			for(int i=1;i<=3;i++){
				while(printVal.printVal != 'C')
					ConC.await();
				
				System.out.print(" C ");
				printVal.printVal='A';
				conA.signal();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
}

