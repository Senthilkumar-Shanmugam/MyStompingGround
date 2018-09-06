package com.learn.datastructures.heap;

import java.util.Arrays;

public class BinaryMinHeap {
	public int capacity;
	public int minHeap[];
	public int size;
	
	public BinaryMinHeap(int capacity){
		this.capacity=capacity;
		minHeap = new int[capacity];
		size=0;
	}

	//Little helper methods,courtesy HackerRank Gayle Laakman
	private int getParentIndex(int childIndex) { return (childIndex-1)/2;}
	private int getLeftChildIndex(int parentIndex) { return parentIndex*2+1;}
	private int getRightChildIndex(int parentIndex) { return parentIndex*2+2;}
	
	private int leftChild(int parentIndex){return minHeap[getLeftChildIndex(parentIndex)];}
	private int rightChild(int parentIndex){return minHeap[getRightChildIndex(parentIndex)];}
	private int parent(int childIndex){return minHeap[getParentIndex(childIndex)];}
	
	private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size;}
	private boolean hasRightChild(int index) { return getRightChildIndex(index) < size;}
	private boolean hasParent(int index) { return getParentIndex(index) >= 0;}
	
	//swaps the values at two indices
	private void swap(int indexOne,int indexTwo){
		int tmp = minHeap[indexOne];
		minHeap[indexOne]=minHeap[indexTwo];
		minHeap[indexTwo]=tmp;
	}
	
	private void ensureCapacity(){
		if(size==capacity){//increase it
			minHeap = Arrays.copyOf(minHeap, capacity*2);
		}
	}
	
	public int peek(){
		if(size==0) throw new IllegalStateException("Heap is empty");
		return minHeap[0];
	}
	public int extractMin(){
		if(size==0) throw new IllegalStateException("Heap is empty");
		int item = minHeap[0];
		minHeap[0] = minHeap[size-1]; // move the last element to removed place that is at index 0. root of Heap
		size--;
		heapifyDown();
		return item;
	}

	public void add(int item){
		ensureCapacity();
		//add the element at the last spot
		minHeap[size]=item;
		size++;
		heapifyUp();
	}
	
	public void displayHeap(){
		for(int i=0;i<size;i++)
            System.out.print(" " + minHeap[i]);

		System.out.println("");
	}
	
	public void createHeap(int[] arrA){
		if(arrA.length > 0){
			for(int i=0;i<size;i++)
              add(arrA[i]);
		}
	}
	
	public void heapifyUp(){ //starts at the last element and adjust the heap as it goes up
		int index  = size -1;
		while(hasParent(index) && parent(index) > minHeap[index]){
			swap(getParentIndex(index),index); //swap
			index=getParentIndex(index); //After swap start from the parent and continue upwards
		}
		
	}
	public void heapifyDown(){
		//starts at root and goes downwards swapping the lesser of left and right
		int index = 0;
		
		while(hasLeftChild(index) ){ // if there is one child || hasRightChild(index).. if there is no left, centainly there will be no right
			//get the smaller of the two children
			int smallerChildIndex = getLeftChildIndex(index);
			
			if(hasRightChild(index) && rightChild(index) < leftChild(index))
				smallerChildIndex  = getRightChildIndex(index);
			
			if(minHeap[index]>minHeap[smallerChildIndex]){
				swap(index,smallerChildIndex); //swap
			}else break;
			index = smallerChildIndex;
		}
	}
	
	
}
