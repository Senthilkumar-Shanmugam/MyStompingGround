package com.learn.datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.learn.datastructures.tree.Tree.Node;

public class LevelOrderTraversal {
	
	private static void LevelOrderTraversal(Node root){
		Queue<Node> q= new LinkedList<Node>();
		Node current = root;
		if(root==null) return;
		q.add(current);
		
		while(!q.isEmpty()){
		   Node t = q.poll();
		   System.out.printf("%d ",t.data);	
		   
		   if(t.left !=null)
			   q.add(t.left);
		   if(t.right!=null)
			   q.add(t.right);
			
		}
		
		
	}

	public static void main(String[] args) {
	/*    Node rootNode =new Node(40);
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
		
		
*/ 
		Node rootNode = new Node(1); 
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

		LevelOrderTraversal(rootNode);
	}

}
