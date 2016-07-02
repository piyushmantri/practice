package com.practice.binarytree;

public class BinaryTree{
	private int value;
	private BinaryTree left, right;
	
	public void setvalue(int value){
		this.value = value;
	}
	public int getvalue(){
		return value;
	}
	
	public void setright(BinaryTree value){
		this.right = value; 
	}
	public BinaryTree getright(){
		return this.right;
	}
	
	public void setleft(BinaryTree value){
		this.left = value;
	}
	public BinaryTree getleft(){
		return this.left;
	}
	
	public BinaryTree(int value){
		setvalue(value);
	}
}