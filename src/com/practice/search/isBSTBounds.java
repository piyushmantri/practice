package com.practice.search;

import com.practice.binarytree.BinaryTree;

public class isBSTBounds {
	public static void main(String[] args){
		BinaryTree b = new BinaryTree(5);
		b.setleft(new BinaryTree(2));
		b.setright(new BinaryTree(7));
		b.getleft().setleft(new BinaryTree(1));
		b.getright().setleft(new BinaryTree(6));
		b.getright().setright(new BinaryTree(11));
		b.getright().getright().setleft(new BinaryTree(8));
		b.getright().getright().setright(new BinaryTree(13));
		System.out.println(isBST(b));
	}
	
	
	static boolean isBST(BinaryTree b){
		if(b == null){
			return true;
		}
		return isInBounds(b, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean isInBounds(BinaryTree bst,int lower, int higher){
		if(bst == null){
			return true;
		}
		if(bst.getvalue() <= higher 
			&& bst.getvalue() > lower 
			&& isInBounds(bst.getright(), bst.getvalue(), higher) 
			&& isInBounds(bst.getleft(), lower, bst.getvalue())){
			return true;
		}else{
			return false;
		}
	}
}
