package com.practice.binarytree;

public class BSTImpl {
	public static void main(String[] args){
		int[] array = {5,2,7,11,6,1,8,13};
		BinaryTree b1 = generateBST(array);
		BinaryTreeImpl.inorder(b1);
	}
	
	static BinaryTree generateBST(int[] array){
		int length = array.length;
		BinaryTree bst=null;
		for(int i=0;i<length;i++){
			bst = createBST(bst,array[i]);
		}
		return bst;
	}

	static BinaryTree createBST(BinaryTree bst,int value){
		BinaryTree bt = new BinaryTree(value);
		
		if(bst == null){
			bst = bt;
			return bst;
		}
		if(bst.getvalue()<value){
			//right
			 bst.setright(createBST(bst.getright(), value));
		}else{
			//left
			bst.setleft(createBST(bst.getleft(), value));
		}
		return bst;
	}
}
