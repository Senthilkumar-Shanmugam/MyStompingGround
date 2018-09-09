package com.learn.datastructures.tree;

import java.util.Stack;

import com.learn.datastructures.tree.Tree.Node;

public class BoundaryTraversal {
	
	public static void main(String[] arg){
		Node rootNode =new Node(40);
		Node node20=new Node(20);
		Node node10=new Node(10);
		Node node30=new Node(30);
		Node node60=new Node(60);
		Node node50=new Node(50);
		Node node70=new Node(70);
		Node node5=new Node(5);
		Node node45=new Node(45);
		Node node55=new Node(55);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		node10.right=node5;
		node5.right=node45;
 
		node50.right=node55;
        postOrderUsingSingleStack(rootNode);
        postOrderUsingTwoStack(rootNode);
	}
	
	private static void postOrderUsingTwoStack(Node root){
		if(root == null) return;
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.push(root);
		while(!s1.isEmpty()){
			Node tmp = s1.pop();
			s2.push(tmp);
			
			if(tmp.left != null)
				s1.push(tmp.left);
			if(tmp.right !=null)
			  s1.push(tmp.right);
		}
		System.out.println();
		//final pop once s2 is filled with the reversal of post order
		while(!s2.isEmpty())
			System.out.printf("%d ",s2.pop().data);
	
	}

	private static void postOrderUsingSingleStack(Node root) {
        if(root==null) return;
        
        Node current = root;
        Stack<Node> s = new Stack<Node>();
	    Node lastVisited = null;
        
        while(current != null || !s.isEmpty()){
	        
        	while(current !=null){
	        	s.add(current);
	        	current = current.left;	
	        }
        
	        //we have reached the left most
	       Node tmp = s.peek();
	       //check if it has a right node
	       
	       if(tmp.right != null && tmp.right != lastVisited){
	    	   current = tmp.right;
	       }else{
	    	   lastVisited = s.pop();
	    	   System.out.printf(" %d ",lastVisited.data);
	       }
	}
	}
}
