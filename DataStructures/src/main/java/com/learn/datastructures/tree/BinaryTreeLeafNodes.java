package com.learn.datastructures.tree;

import com.learn.datastructures.tree.Tree.Node;

public class BinaryTreeLeafNodes {
	
	public static void main(String []ss){
		Node rootNode =new Node(40);
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
       
		System.out.println(" No of leaf nodes>>"+countLeafNodes(rootNode));
		printLeafNodes(rootNode);
	}

	private static int  countLeafNodes(Node node) {
		if(node == null) return 0;
		
		if(node.left == null && node.right == null)
			return 1;
		else 
			return countLeafNodes(node.left)+countLeafNodes(node.right);
		
	}

	private static void printLeafNodes(Node node) {
		if(node == null) return;
	 	
	    if(node.left == null && node.right == null)
	    	System.out.printf(" %d ",node.data);
	    
	    printLeafNodes(node.left);
	    printLeafNodes(node.right);

     }

}
