package com.learn.datastructures.linear;

/**
 * First in First out(FIFO).. we need two pointers..
 * we deque from the front
 * when we enqueue we do it at the reat
 * @author seshshan
 *
 */
public class QueueWithArray {
	 private int capacity; 
	 private int[] items;
	 int size=0;
	 int rear=-1;// we insert at the rear , so initailly its is -1
	 int front=0;
	 
	 public QueueWithArray(int capacity){
		 this.capacity=capacity;
		 items= new int[capacity];
	 }
	 
	 public boolean isQueueEmpty(){
		 return  size==0;
	 }
	 
	 public boolean isQueueFull(){
		 return size==capacity;
	 }
	 
	 public void enqueue(int item){
		 if(isQueueFull()){
			 System.out.println("Queue is full");
			 return;
		 }
		 rear++;
		 if(rear==size-1)
			 rear=0;
		 items[rear]=item;
		 size++;
		 System.out.println("Element " + item+ " is pushed to Queue !");
		 
	 }
	 public void dequeue(){
		 if(isQueueEmpty()){
			 System.out.println("Queue is empty");
			 return ;
		 }
		 front++;
		 if(front==size-1){
			 System.out.println("Pop operation done ! removed: "+items[front-1]);
			 front = 0;
		 }else{
			 System.out.println("Pop operation done ! removed: "+items[front-1]);
		 }
		 size--;
	 }

	public static void main(String[] args) {
		QueueWithArray queue = new QueueWithArray(4);
		queue.enqueue(4);
		queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
	}

}
