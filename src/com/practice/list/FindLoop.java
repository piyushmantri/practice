package com.practice.list;

/**
 * Created by Piyush M on 03-07-2016.
 */
public class FindLoop {
    public static void main(String[] args){
        Node list = new Node(5);
        list.setNext(new Node(2));
        list.getNext().setNext(new Node(7));
        list.getNext().getNext().setNext(new Node(11));
        list.getNext().getNext().getNext().setNext(new Node(9));
        list.getNext().getNext().getNext().getNext().setNext(new Node(10));
        list.getNext().getNext().getNext().getNext().getNext().setNext(new Node(1));
        list.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new Node(3));
        list.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(list.getNext().getNext());
        System.out.print(isLinkListLoop(list));
        System.out.print(checkLoopmeeting(list).getValue());
        System.out.print(checkNumberofNodesInLoop(list));
        removeLoop(list);
        PrintListRecursion.printList(list);
        //Test corner case : List containing 2 nodes
//        Node test = new Node(5);
//        test.setNext(new Node(2));
//        test.getNext().setNext(test);
//        System.out.print(isLinkListLoop(test));
    }

    static boolean isLinkListLoop(Node head){
        if (head == null || head.getNext() == null || head.getNext().getNext() == null){
            return false;
        }

        Node p = head.getNext().getNext();
        Node q = head.getNext();

        while(p!=q){
            if (p.getNext()== null || p.getNext().getNext() == null){ return false; }
            p = p.getNext().getNext();
            q = q.getNext();
        }
        return true;
    }

    //Check if loop and remove it
    static Node checkLoopmeeting(Node head){
        if (head == null || head.getNext() == null || head.getNext().getNext() == null){
            return null;
        }

        Node p = head.getNext().getNext();
        Node q = head.getNext();

        while(p!=q){
            if (p.getNext()== null || p.getNext().getNext() == null){ return null; }
            p = p.getNext().getNext();
            q = q.getNext();
        }
        return p;
    }

    static int checkNumberofNodesInLoop(Node head){
        if (checkLoopmeeting(head) == null || head == null || head.getNext() == null || head.getNext().getNext() == null)
            return 0;

        Node p = head.getNext().getNext();
        Node q = head.getNext();

        while(p!=q){
            if (p.getNext()== null || p.getNext().getNext() == null){ return 0; }
            p = p.getNext().getNext();
            q = q.getNext();
        }
        int numberOfNodes = 1;
        q = q.getNext();
        while(p != q){
            q = q.getNext();
            numberOfNodes++;
        }
        return numberOfNodes;
    }

    static void removeLoop(Node head){
        if (checkLoopmeeting(head) == null || head == null || head.getNext() == null)
            return;

        int count = checkNumberofNodesInLoop(head);

        Node p = head;
        Node q = head;

        while (count > 0){
            p = p.getNext();
            count --;
        }

        while (p!=q){
            if (p.getNext()==q.getNext()){
                p.setNext(null);
                return;
            }
            p = p.getNext();
            q = q.getNext();
        }
        return;
    }
}
