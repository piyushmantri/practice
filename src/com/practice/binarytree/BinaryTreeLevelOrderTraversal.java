package com.practice.binarytree;

/**
 * Created by Piyush M on 20-06-2016.
 */
public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args){
        BinaryTree b = new BinaryTree(5);
        b.setleft(new BinaryTree(2));
        b.setright(new BinaryTree(7));
        b.getleft().setleft(new BinaryTree(1));
        b.getright().setleft(new BinaryTree(6));
        b.getright().setright(new BinaryTree(11));
        b.getright().getright().setleft(new BinaryTree(8));
        b.getright().getright().setright(new BinaryTree(13));
        LevelOrderTraverse(b);
    }

    static void LevelOrderTraverse(BinaryTree bt){
        if(bt==null){
            return;
        }

    }
}
