package java.com.learn.datastructures.tree;


public class Tree {
    private Node root = null;
    
    Tree(Node root){
    	this.root=root;
    }
    
    public static void insert(Node root,int data){
    	if(root == null){ // only very first time
    		root = new Node(data);
    	}else if(data < root.data) {
    		if( root.left == null)
    			root.left = new Node(data);
    		else
    			insert(root.left,data);
    	}else{
    		if(root.right == null)
    			root.right = new Node(data);
    		else
    			insert(root.right,data);
    	}
    }
    
   public static boolean iterativeBinarySearch(Node root,int data){
	   if (root !=null)
		   return false;
	   
	   
	   while(root != null){
		   if(root.data == data)
			   return true;
		   else if( data < root.data)
		    root = root.left;
		    else
		    	root = root.right;
	   }
	   return false;
   }
    //returns the root node of the found node
    public static boolean contains(Node root,int data){
    	if(root==null)
    		return false;
    	else if(root.data == data)
    	     return true;	
    	else if(data < root.data)
    		contains(root.left,data);
    	else
    		contains(root.right,data);
		return false;
    }
	
	private static class Node{
		int data;
		private Node left,right;
		
		Node(int data){
			this.data=data;
		}
	}
}
