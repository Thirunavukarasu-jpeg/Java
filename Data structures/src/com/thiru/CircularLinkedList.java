package com.thiru;

public class CircularLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node tempNode = head;
            while(tempNode.next !=  head) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            newNode.next = head;
//            System.out.println(tempNode.next.value);
        }
    }

    public void displayCircularLinkedList() {

        if(head != null) {
            Node tempNode = head;
            do {
                System.out.print(tempNode.value + " -> ");
                tempNode = tempNode.next;

            } while(tempNode != head);
            System.out.println("Head");

            return;
        }
        System.out.println("Empty");

    }
}
