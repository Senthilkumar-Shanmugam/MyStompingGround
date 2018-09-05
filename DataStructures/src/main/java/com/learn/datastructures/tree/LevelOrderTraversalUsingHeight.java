package com.learn.datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.learn.datastructures.tree.Tree.Node;

public class LevelOrderTraversalUsingHeight {

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

		LevelOrderTraversal(rootNode);

	}
	
	private static int heightOfATreeIterative(Node root){
		Queue<Node> q = new LinkedList<Node>();
		int height = 0;
		// add root to the queue
		q.add(root);
		// add null as marker
		q.add(null);
		
		while(!q.isEmpty()){
			Node t = q.remove();
			
			if(t == null){ //reached end of a level
				if(!q.isEmpty()) //queue is not empty that means there are more levels to go
				  q.add(null);
				
				height++; //increment the height
			}else{
				if(t.left != null)
					q.add(t.left);
				
				if(t.right !=null)
					q.add(t.right);
				
			}
		}
		return height;
	}
	
	private static int heightOfATreeRecusrion(Node root){
			if(root == null) return 0;
			
			int lh= heightOfATreeRecusrion(root.left);
			int rh = heightOfATreeRecusrion(root.right);
			
			return lh>rh? (1+lh):(1+rh);
	}

	private static void LevelOrderTraversal(Node rootNode) {
		 System.out.printf("height of this tree = %d",heightOfATreeRecusrion(rootNode));
		 System.out.printf("\nheight of this tree = %d",heightOfATreeIterative(rootNode));
		 
		 int height = heightOfATreeRecusrion(rootNode);
		 
		 for(int i=1;i<=height;i++)
			 printNodesAtGivenLevel(rootNode,i);

	}
	
	private static void printNodesAtGivenLevel(Node current,int level){
		if(current == null) return;
		
		if(level == 1) //if we are at the intended level
			System.out.printf(" %d ",current.data);
		
		if(level > 1) // go to that level for both childen.. recursive
		{
			printNodesAtGivenLevel(current.left,level-1);
			printNodesAtGivenLevel(current.right,level-1);

			
		}
		
		
	}

}
