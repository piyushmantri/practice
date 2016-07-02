package com.practice.list;

/**
 * Created by Piyush M on 02-07-2016.
 */
public class DNode {
    private int value;
    private DNode prev;
    private DNode next;

    public DNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }
}
