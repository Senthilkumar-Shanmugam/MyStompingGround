package com.learn.datastructures.tree;

import java.util.Stack;

import com.learn.datastructures.tree.Tree.Node;

public class ZigZagTraversal {

	public static void main(String[] args) {
		/*Node rootNode = new Node(1); 
        Node node1m = new Node(-1);
        Node node11 = new Node(11);
        Node node2m = new Node(-2);
        Node node3m = new Node(-3);
        Node node21 = new Node(21);
        Node node6 = new Node(6);
        Node node5 = new Node(5);

        rootNode.left=node1m;
        rootNode.right=node11;
        
        node1m.left=node2m;
        node1m.right=node3m;
        
        node3m.right=node5;
        node11.left = node21;
        node11.right= node6;
*/
		Node rootNode =new Node(40);
		Node node20=new Node(20);
		Node node10=new Node(10);
		Node node30=new Node(30);
		Node node60=new Node(60);
		Node node50=new Node(50);
		Node node70=new Node(70);
		Node node5=new Node(5);
		Node node55=new Node(55);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
		node10.left=node5;
		node50.right=node55;
 
		ZigZagTraversal(rootNode);

	}

	private static void ZigZagTraversal(Node root) {

		if(root == null) return;
		Node current = root;
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.add(current);
		
		while(!s1.isEmpty() || !s2.isEmpty()){
		   while(!s1.isEmpty()){
		      Node tmp = s1.pop();
		      System.out.printf(" %d ",tmp.data);
		      
		      if(tmp.left != null)
		    	  s2.add(tmp.left);
		      
		      if(tmp.right !=null)
		    	  s2.add(tmp.right);
		   }
		   
		   while(!s2.isEmpty()){
			   Node tmp = s2.pop();
			   System.out.printf(" %d ",tmp.data);
			   
		      if(tmp.right !=null)
		    	  s1.add(tmp.right);
		      
		      if(tmp.left != null)
		    	  s1.add(tmp.left);
			      
		   }
		}
 		
	}

}
