package com.learn.algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class HeapSortUsingMinHeap {
	
	private static int size;
	
	private static int getParentIndex(int index){return (index-1)/2;}
	private static int getLeftChildIndex(int parentIndex){return 2*parentIndex+1;}
	private static int getRightChildIndex(int parentIndex){return 2*parentIndex+2;}
	
	private static Comparable leftChild(int parentIndex,Comparable[] minHeap){return minHeap[getLeftChildIndex(parentIndex)];}
	private static Comparable rightChild(int parentIndex,Comparable[] minHeap){return minHeap[getRightChildIndex(parentIndex)];}
	private static Comparable parent(int childIndex,Comparable[] minHeap){return minHeap[getParentIndex(childIndex)];}
	
	private static boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size;}
	private static boolean hasRightChild(int index) { return getRightChildIndex(index) < size;}
	private static boolean hasParent(int index) { return getParentIndex(index) >= 0;}
	
	
	private static void swap(Comparable[] arr,int indexOne, int indexTwo){
		Comparable tmp = arr[indexOne];
		arr[indexOne] = arr[indexTwo];
		arr[indexTwo] = tmp;
		
	}

	private static void sort(Comparable[] input){
		size = input.length;
		
		//Step1. build Min Heap from the input array
		//start comparing from the nonleaf nodes. the reason we do this is size-1/2. gets all non-leaf nodes
		//we know that leaf nodes dont have any children and we dnot have to worry about minheap variant and we do 
		//this only for the parent nodes.
		
		for(int i=size-1/2;i>=0;i--){
			transformToMinHeap(input,i);//check and transform the tree at this node 'i'.keep doing it till we reach the root node
		}
		
		//display the rearranged MinHeap array
		System.out.println("\nInput Array transfomred to minheap\n");
		System.out.println(Arrays.toString(input));
		
		ArrayList<Comparable> tmp = new ArrayList();
		//Step2. Remove the top from min heap and heapify
	      // One by one extract an element from heap
         for (int i = size - 1; i >= 0; i--) {
             
            // Move current root to end
            Comparable temp = input[0];
            tmp.add(temp);
            input[0] = input[i];
            //input[i] = temp;
 
            // call max heapify on the reduced heap
            transformToMinHeap(input,  0);
        }
 
		System.out.println("sorted\n");
		for(Comparable i : tmp)
			System.out.printf(" %d ",i);
	}
	
	private static void transformToMinHeap(Comparable[] input,int index){
		//check if the parent is bigger than any of the child node, if it is swap it with the smalleest child node
		while(hasLeftChild(index) ){ // if there is one child || hasRightChild(index).. if there is no left, centainly there will be no right
			//get the smaller of the two children
			int smallerChildIndex = getLeftChildIndex(index);
			
			if(hasRightChild(index) && rightChild(index,input).compareTo(leftChild(index,input)) <0) 
				smallerChildIndex  = getRightChildIndex(index);
			
			if(input[index].compareTo(input[smallerChildIndex]) > 0){
				swap(input,index,smallerChildIndex); //swap
			}else 
			 break;
			index = smallerChildIndex;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Integer arr[] = new Integer[]{ 1,12,9,5,6,10};
		System.out.println("\nInput array");
		System.out.println(Arrays.toString(arr));
		sort(arr);
		//System.out.println(Arrays.toString(arr));
	}
	
	

	
}
