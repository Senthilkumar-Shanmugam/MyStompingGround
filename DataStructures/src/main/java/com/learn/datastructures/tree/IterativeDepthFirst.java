package com.learn.datastructures.tree;

/**
 * In tree we can only traverse top to down(depth first). we do not have pointers to parent of a node.
 * recursion uses implicit stack to come back to the last (previous).
 * To traverse iteratively we have to use stack so that we do not lose the path we traversed and we can 
 * go to the right subtrees that have not been traversed yet. 
 * 
 */
import java.util.Stack;

import com.learn.datastructures.tree.Tree.Node;

public class IterativeDepthFirst {
	
	private static void preOrder(Node root){
	   if(root == null) return;
	   
	   Node current = root;
	   Stack<Node> s = new Stack<Node>();
	   s.push(current);
	   while( !s.isEmpty()){
	     Node t = s.pop();
	     System.out.printf("%d ",t.data);
	     
	     if(t.right != null)
	    	 s.push(t.right);
	     
	     if(t.left!=null)
	    	 s.push(t.left);
	   }
	
	}
	
	private static void inOrder(Node root){
		if(root == null) return;
		   
		   Node current = root;
		   Stack<Node> s = new Stack<Node>();
		   while( !s.isEmpty() || current != null){
			   if(current!=null)
				{
					s.push(current);
					current=current.left;
				}
				else
				{
					Node n=s.pop();
					System.out.printf("%d ",n.data);
					current=n.right;
				}
			   }
			   
		   }
	
	
	private  static void postOrder(Node root){
		if(root == null) return;
		Node lastVisited=null,current = root;
		Stack<Node> s = new Stack<Node>();
		
		while(current !=null || !s.empty() ){
			while(current != null){
				s.push(current);
				current = current.left;
			}
			
			//check if the top item has right node
			if(s.peek().right !=null && s.peek().right != lastVisited){ //if it is we have to visit before we visit the top
				current = s.peek().right;
			}else{//leaf node so print it
				lastVisited = s.pop();
				System.out.printf("%d ",lastVisited.data);
				
			}
		}
	}

	public static void main(String[] args) {
	
		Node rootNode = new Node(1); 
	    Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		Node node5=new Node(5);
		Node node6=new Node(6);
		Node node7=new Node(7);
		Node node8=new  Node(8);
		
		rootNode.left=node2;
		rootNode.right=node3;
 
		node2.left=node4;
		node2.right=node5;
		node5.left=node6;
 
		node3.right=node7;
		node7.right=node8;
        
		System.out.println("In order");
		inOrder(rootNode);
		System.out.println("\npreOrder");
		preOrder(rootNode);
		System.out.println("\npost order");
		postOrder(rootNode);

	}

}
