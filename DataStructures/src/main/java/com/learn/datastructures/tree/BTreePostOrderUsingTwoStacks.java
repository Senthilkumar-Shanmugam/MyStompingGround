package com.learn.datastructures.tree;

import java.util.Stack;

import com.learn.datastructures.tree.Tree.Node;

public class BTreePostOrderUsingTwoStacks {
	
	private static void postOrder(Node root){
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
		
		//final pop once s2 is filled with the reversal of post order
		while(!s2.isEmpty())
			System.out.printf("%d ",s2.pop().data);
	}

	public static void main(String[] args) {
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
        postOrder(rootNode);
  
	}

}
