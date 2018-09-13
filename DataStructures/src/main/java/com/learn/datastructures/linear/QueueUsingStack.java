package com.learn.datastructures.linear;

import java.util.Stack;

/**
 * This soultion uses two stacks..one to add one to pop.
 * @author seshshan
 *
 * @param <T>
 */
public class QueueUsingStack<T> {
	private Stack<T> stackNewest,stackOldest;
	    
	public QueueUsingStack(){
		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();
	
	}
	
	public int size(){
		return stackNewest.size() + stackOldest.size();
	}
	
	public void push(T e){
	 stackNewest.push(e);	
	}
	
	//do this only when necessary
	private void shiftStacks(){
	   if(stackOldest.isEmpty()){
		  while(!stackNewest.isEmpty())
			  stackOldest.push(stackNewest.pop());
	   }
	}
	
	public T pop(){
		shiftStacks();
		return stackOldest.pop();
	}
	
	public T peek(){
		shiftStacks();
		return stackOldest.peek();
	}
	
	
}
