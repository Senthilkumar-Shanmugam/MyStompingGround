package com.learn.datastructures.linear;

public class ReverseLinkedList {
	
	private static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
		
		Node(int data,Node node){
			this.data = data;
			this.next=node;
		}
	}
	
	
	private static void printLinkedList(Node head){
		Node node = head;
		while(node !=null){
			System.out.printf(" %d ",node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
          
        System.out.println("Given Linked list"); 
        list.printLinkedList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printLinkedList(head);
	}

	/**
	 * 
	 * @param head2
	 * @return
	 */
	private Node reverse(Node head) {
		Node current=head;
		Node previous =null,next = null;;
		
		while(current !=null){
			next = current.next;
			current.next=previous;
			previous=current;
			current = next;
		}
		return previous;
	}

}
