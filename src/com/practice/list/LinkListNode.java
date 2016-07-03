package com.practice.list;

/**
 * Created by Piyush M on 03-07-2016.
 */
public class LinkListNode {
    public static void main(String[] args){
        Node list = new Node(5);
        list.setNext(new Node(2));
        list.getNext().setNext(new Node(7));
        list.getNext().getNext().setNext(new Node(11));
        list.getNext().getNext().getNext().setNext(new Node(9));
        list.getNext().getNext().getNext().getNext().setNext(new Node(10));
        PrintListRecursion.printList(list);
        DeleteLinkListNode(7 ,list);
        System.out.println();
        PrintListRecursion.printList(list);
    }

    /*
    * Will return the size of link list.
    */
    public static int size(Node head){
        Node p = head;
        int count = 0;
        while(p != null){
            count++;
            p = p.getNext();
        }
        return count;
    }

    public static boolean doesLinkListContain(int nodeToFind, Node head){
        Node p = head;
        if (p == null)
            return false;
        while (p != null){
            if (p.getValue() == nodeToFind){
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    /*
    * NOTE: WILL NOT WORK TO DELETE FIRST NODE OR IF THERES ONLY ONE NODE IN THE LIST
    */
    public static boolean DeleteLinkListNode(int nodeToDelete, Node head){
        Node p = head;
        if (p==null){
            return false;
        }
        if (doesLinkListContain(nodeToDelete, p)){
            while (p != null){
                if (p.getNext().getValue() == nodeToDelete){
                    p.setNext(p.getNext().getNext());
                    return true;
                }
                p = p.getNext();
            }
        } else {
            return false;
        }
        return false;
    }
}
