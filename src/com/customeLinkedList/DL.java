package com.customeLinkedList;

public class DL {

    private Node head;
    private Node tail;
    private int size;

    public DL() {
        this.size = size;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if( head != null ) {
            head.prev = node;
        }

        head = node;

        if( tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if( head == null ) {
            node.prev = null;
            head = node;
        }

        while( last.next != null ) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        size++;
    }

    public void insert(int after, int value) {
        Node p = find(after);
    }

    public Node find(int value) {
        Node node = head;
        while( node != null ) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int deleteFirst() {
        int val  = head.value;
        if(head.next != null) {
            head = head.next;
            head.prev = null;
        }
        head = head.next;
        if(head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public void display() {
        Node tempHead = head;
        while( tempHead != null ) {
            System.out.print(tempHead.value + " -> ");
            tempHead = tempHead.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node tempTail = tail;
        while( tempTail != null ) {
            System.out.print(tempTail.value + " -> ");
            tempTail = tempTail.prev;
        }
        System.out.println("END");
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
