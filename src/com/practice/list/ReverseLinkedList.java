package com.practice.list;

/**
 * Created by Piyush M on 02-07-2016.
 */
public class ReverseLinkedList {
    static Node list;
    static Node head;

    public static void main(String[] args){
        list = new Node(5);
        list.setNext(new Node(2));
        list.getNext().setNext(new Node(7));
        list.getNext().getNext().setNext(new Node(11));
        list.getNext().getNext().getNext().setNext(new Node(9));
        list.getNext().getNext().getNext().getNext().setNext(new Node(10));
        PrintListRecursion.printList(list);
        reverseList(list);
        PrintListRecursion.printList(head);
    }

    static void reverseList(Node p){
        if (p == null)
            return;
        if (p.getNext()==null) {
            head = p;
            return;
        }
        reverseList(p.getNext());
        p.getNext().setNext(p);
        p.setNext(null);
    }
}
