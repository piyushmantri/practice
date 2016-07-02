package com.practice.list;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Piyush M on 02-07-2016.
 */
public class FindMerge {
    public static void main(String[] args) {
        Node list1 = new Node(5);
        list1.setNext(new Node(2));
        list1.getNext().setNext(new Node(7));
        list1.getNext().getNext().setNext(new Node(11));
        list1.getNext().getNext().getNext().setNext(new Node(9));
        list1.getNext().getNext().getNext().getNext().setNext(new Node(10));

        Node list2 = new Node(1);
        list2.setNext(new Node(3));
        list2.getNext().setNext(new Node(4));
        list2.getNext().getNext().setNext(list1.getNext().getNext().getNext());
        Node mergeNode = mergeFinder(list1, list2);
        if (mergeNode != null)
            System.out.print("Merging at "+ mergeNode.getValue());
        else
            System.out.print("Not Merging");
    }

    static Node mergeFinder(Node head1, Node head2){
        Node l1 = head1;
        Node l2 = head2;

        Set next_values = new HashSet();

        while(l1 != null){
            next_values.add(l1);
            l1 = l1.getNext();
        }

        while (l2 != null){
            if(next_values.contains(l2)) {
                return l2;
            }
            l2 = l2.getNext();
        }
        return null;
    }
}
