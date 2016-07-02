package com.practice.list;

/**
 * Created by Piyush M on 02-07-2016.
 */
public class PrintListLoop {
    public static void main(String[] args){
        Node list = new Node(5);
        list.setNext(new Node(2));
        list.getNext().setNext(new Node(7));
        list.getNext().getNext().setNext(new Node(11));
        list.getNext().getNext().getNext().setNext(new Node(9));
        list.getNext().getNext().getNext().getNext().setNext(new Node(10));
        printList(list);
    }

    static void printList(Node head){
        Node l = head;
        while(l!= null){
            System.out.print(l.getValue() + ", ");
            l = l.getNext();
        }
    }
}
