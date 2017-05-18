package com.test.codingtest.trees;

public class IsBST {
	Node root;
	 Node prev;
	 boolean isBST(Node root){
		 if(root!=null)
		 {
			 if(!isBST(root.left))
				 return false;
			 if(prev!=null&&prev.data>=root.data)
				 return false;
			 prev=root;
			 return isBST(root.right);
		 }
		 return true;
	 }
	public static void main(String[] args) {
		IsBST tree=new IsBST();
		tree.prev=null;
		tree.root=new Node(4);
		tree.root.left=new Node(2);
		tree.root.right=new Node(5);
		tree.root.left.left=new Node(1);
		tree.root.left.right=new Node(8);
		
		System.out.println(tree.isBST(tree.root));
		
		

	}

}
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}