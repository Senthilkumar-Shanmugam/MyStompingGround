package com.learn.datastructures.tree;

import com.learn.datastructures.tree.Tree.Node;

public class RecursiveTraversals {
	
	private static void inOrder(Node root){
		if(root != null){
			inOrder(root.left);
			System.out.printf("%d ",root.data);
			inOrder(root.right);
		}
	}
	
	private static void preOrder(Node root){
		if(root != null){
			System.out.printf("%d ",root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	private  static void postOrder(Node root){
		if(root != null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.printf("%d ",root.data);
		}
	}

	public static void main(String[] args) {
	
		Node rootNode = new Node(40); 
	    Node node20=new Node(20);
		Node node10=new Node(10);
		Node node30=new Node(30);
		Node node60=new Node(60);
		Node node50=new Node(50);
		Node node70=new Node(70);
		
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
        
		System.out.println("In order");
		inOrder(rootNode);
		System.out.println("preOrder");
		preOrder(rootNode);
		System.out.println("post order");
		postOrder(rootNode);

	}

}
