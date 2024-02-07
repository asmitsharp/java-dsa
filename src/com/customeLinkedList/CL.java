package com.customeLinkedList;

public class CL {
    private Node head;
    private Node tail;
    private int size;

    public CL() {
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;

        size++;

    }

    public void delete(int value) {
        Node node = head;
        if(node == null) {
            return;
        }

        if(head == tail) {
            head = tail;
            tail = null;
            return;
        }

        if(node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
            size--;
    }





    public void display() {
        Node node = head;
        if(head != null) {
            do {
                System.out.print(node.value + " -> ");
                if(node.next != null) {
                    node = node.next;
                }
            }while(node != head);
            System.out.println("Head");
        }
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
