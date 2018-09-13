package com.learn.datastructures.linear;

import java.util.Stack;

public class QueueUsingStack<T> {
	private Stack<T> newElemnts = new Stack<T>();
	private Stack<T> OldElements= new Stack<T>();
	    
	
	
	
	public QueueUsingStack(){
	
	}
	
	public void add(T e){
		
		
	}
	
	/*public T remove(){
		
	}
	
	public T peek(){
		
	}*/
	
	public int size(){
		return newElemnts.size()+OldElements.size();
				
	}
	
	

}
