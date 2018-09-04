package com.learn.datastructures.tree;

import com.learn.datastructures.tree.Tree.Node;

public class RecursiveLevelOrderTraversal {

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

	private static void LevelOrderTraversal(Node rootNode) {
		
	}

}
