package com.practice.list;

/**
 * Created by Piyush M on 02-07-2016.
 */
public class PrintListRecursion {
    public static void main(String[] args){
        Node list = new Node(5);
        list.setNext(new Node(2));
        list.getNext().setNext(new Node(7));
        list.getNext().getNext().setNext(new Node(11));
        list.getNext().getNext().getNext().setNext(new Node(9));
        list.getNext().getNext().getNext().getNext().setNext(new Node(10));
        System.out.print("Samne se: ");
        printList(list);
        System.out.println();
        System.out.print("Piche se: ");
        printListReverse(list);
    }

    static void printList(Node head){
        Node l = head;
        if(l == null)
            return;
        System.out.print(l.getValue() + ", ");
        printList(l.getNext());
    }

    static void printListReverse(Node head){
        Node l = head;
        if(l == null)
            return;
        printListReverse(l.getNext());
        System.out.print(l.getValue() + ", ");
    }
}
