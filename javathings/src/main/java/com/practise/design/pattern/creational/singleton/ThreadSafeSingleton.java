package com.practise.design.pattern.creational.singleton;

public final class ThreadSafeSingleton {
	private static ThreadSafeSingleton INSTANCE = null;
	
	//Runtime rt = Runtime.getRuntime(); uses eager initialization
	
	private ThreadSafeSingleton(){
		
	}
	
	public static ThreadSafeSingleton getInstance(){
		if(INSTANCE == null){
			synchronized (ThreadSafeSingleton.class) {
				if(INSTANCE==null)
					INSTANCE = new ThreadSafeSingleton();
			}
		}
		
		return INSTANCE;
	}

}
