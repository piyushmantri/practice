package com.practice.list;

/**
 * Created by Piyush M on 02-07-2016.
 */
public class Node {
    private int value;
    private Node next;

    public Node(int v){
        this.value = v;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int v){
        this.value = v;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}

