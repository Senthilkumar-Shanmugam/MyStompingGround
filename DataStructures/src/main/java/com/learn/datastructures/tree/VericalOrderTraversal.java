package com.learn.datastructures.tree;
import com.learn.datastructures.tree.Tree.Node;

public class VericalOrderTraversal {
	
	class Values{
		int min,max;
	}
	
	private void printTreeVertically(Node node){
		Values val = new Values();
		findMinMax(node,val,val,0); 
		
		//Iterate through all possible vertical lines starting from min to max(i.e left to right)
		
		for(int level=val.min;level<=val.max;level++){
			printNodesAtVerticalLevel(node,level);
		}
	}
	
	private void printNodesAtVerticalLevel(Node node, int level) {
		// TODO Auto-generated method stub
		
	}

	//finds the min max horizontal distance wrt root
	private void findMinMax(Node node, Values val, Values val2, int i) {
		
	}

	public static void mian(String[] args){
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        root.right.left.right = new Node(8); 
        root.right.right.right = new Node(9); 
   
	}

}
