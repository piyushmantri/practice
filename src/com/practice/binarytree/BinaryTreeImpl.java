package com.practice.binarytree;

public class BinaryTreeImpl {
	public static void main(String[] args){
		BinaryTree b = new BinaryTree(5);
		b.setleft(new BinaryTree(2));
		b.setright(new BinaryTree(7));
		b.getleft().setleft(new BinaryTree(1));
		b.getright().setleft(new BinaryTree(6));
		b.getright().setright(new BinaryTree(11));
		b.getright().getright().setleft(new BinaryTree(8));
		b.getright().getright().setright(new BinaryTree(13));
		preorder(b);
		System.out.println();
		inorder(b);
		System.out.println();
		postorder(b);
		System.out.println();
	}
	
	static void preorder(BinaryTree b){
		if(b==null){
			return;
		}
		System.out.print(b.getvalue()+"  ");
		preorder(b.getleft());
		preorder(b.getright());
	}
	
	static void inorder(BinaryTree b){
		if(b==null){
			return;
		}
		inorder(b.getleft());
		System.out.print(b.getvalue()+"  ");
		inorder(b.getright());
	}
	
	static void postorder(BinaryTree b){
		if(b==null){
			return;
		}
		postorder(b.getleft());
		postorder(b.getright());
		System.out.print(b.getvalue()+"  ");
	}
}
