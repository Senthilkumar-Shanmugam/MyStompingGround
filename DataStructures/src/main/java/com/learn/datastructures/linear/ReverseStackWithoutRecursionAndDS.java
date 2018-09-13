package com.learn.datastructures.linear;

import java.util.Stack;

/**
	Write a program to reverse a stack using recursion. You are not allowed to use loop constructs like while, for..etc, and you can only use the following ADT functions on Stack S:
	isEmpty(S)
	push(S)
	pop(S
 * Double recursion.
 *Solution : the idea is to hold all values in functional call stack until stack becomes empty
 *when the stack becomes empty ,insert all held items one by one at the bottom of the stack
 */
public class ReverseStackWithoutRecursionAndDS {
	public static void main(String [] args){
		Stack<Character> st = new Stack<Character>();
		st.push('1');
		st.push('2');
		st.push('3');
		st.push('4');
		
		 System.out.println("Original Stack");
         
        System.out.println(st);
        
        
        reverse(st);
         
        System.out.println("Reversed Stack");
         
        System.out.println(st);

	}

	/** Step1 . First Recursion
	 * Removes all the elements from stack 1 until stack becomes empty and keeps it in functional call stack
	 * @param st
	 */
	private static void reverse(Stack<Character> st) {
		if(!st.isEmpty()){
			Character c = st.pop();
			reverse(st);
			insertAtBottom(st,c);

		}
	}
	
	/**
	 * Step2 . Second Recursion
	 *  Important. Have to push the element to the bottom.here is how it is done
	 *  1. if stack is empty push the item
	 *  2.else pop all the elements and keep it in call stack,push the latest element and push the elements in call stack 
	 * @param st
	 * @param c
	 */
	public static void insertAtBottom(Stack<Character> st,Character c){
		if(st.isEmpty())
		st.push(c);
		else{ // 2nd recursion
			Character c1 = st.pop();
			insertAtBottom(st, c);
			st.push(c1);
		}
	}
}
