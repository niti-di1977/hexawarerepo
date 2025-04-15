package com.example.treeexamples;


//It is a tree where each node has at most two childred(L & R) (0,1,2)
//It is not necessarily that the tree is sorted
class Node{
	
	
	String data ;
	Node left , right;
	
	public Node(String item) {
		
		this.data = item;
		left = right = null;
		
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
		
	
}


public class BinaryTree {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node("R");
		root.left = new Node("LN");
		root.right = new Node("RN");
		root.left.left  = new Node("Left of Left Node");
		System.out.println("Root Node : " + root);

	}

}
