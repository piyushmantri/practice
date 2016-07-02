package com.practice.search;

import com.practice.binarytree.BinaryTree;

public class isBSTByInorder {
	static Integer value=null;
	
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
		return isBSTbyInorder(b);
	}
	static boolean isBSTbyInorder(BinaryTree bt){
		if(bt==null){
			return true;
		}
		if(!isBSTbyInorder(bt.getleft())){
			return false;
		}
		if(!isInBounds(bt.getvalue())){
			return false;
		}
		if(!isBSTbyInorder(bt.getright())){
			return false;
		}
		return true;
	}
	
	static boolean isInBounds(int btvalue){
		if(value==null){
			value = btvalue;
			return true;
		}
		if(btvalue > value){
			value = btvalue;
			return true;
		}else{
			return false;
		}
	}
}
