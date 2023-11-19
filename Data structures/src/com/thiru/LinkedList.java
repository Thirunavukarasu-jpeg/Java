package com.thiru;

public class LinkedList {
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

//    public Node createNode(int val, Node next){
//        return new Node(val,next);
//    }

    public void insertFirst(int val) {
        Node newNode = new Node(val,head);
        head = newNode;
        size += 1;
        if(tail == null) {
            tail = head;
        }
    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
//        Node tempNode = head;
//        while(tempNode.next != null) {
//            tempNode = tempNode.next;
//        }
//        tempNode.next = newNode;
//        tail = newNode;
//        size += 1;
        if(tail == null) {
            this.insertFirst(val);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size ++;

    }

    public void insertAtIndex(int val,int index){
        int currentIndex = 0;
        if (index == 0 || head == null) {
            this.insertFirst(val);
        } else if (index == size || index > size) {
            this.insertLast(val);
        } else {
            Node newNode = new Node(val);
            Node tempNode = head;
            while(currentIndex != index-1 && tempNode.next != null) {
                tempNode = tempNode.next;
                currentIndex += 1;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            size ++;
        }


    }
    public String deleteFist() {

        if(head == null) {
            tail = null;
            return "null";
        } else {
            int deletedValue = head.val;
            head = head.next;
            size --;
            return Integer.toString(deletedValue);
        }


    }
    public int deleteLast() {
        Node tempNode = head;

        while(tempNode.next != tail) {
            tempNode = tempNode.next;
        }
        int deletedValue = tempNode.next.val ;
        tempNode.next = null;
        tail = tempNode;
        size --;

        return deletedValue;
    }

    public void deleteAtIndex(int index) {
        if(head.next == null || index <= 0) {
            this.deleteFist();
            return;
        } else if (index == size || index > size) {
            this.deleteLast();
            return;
        }
        int currentIndex = 1;
        Node current =  head.next;
        Node previous = head;

        while(index != currentIndex) {
            currentIndex ++;
            previous = current;
            current = current.next;
        }
        size --;
        previous.next = current.next;
    }

    public Node getNode(int index) {
        if(index == 0) {
            return  head;
        } else if(index == size) {
            return tail;
        } else {
            int currentIndex = 0;
            Node tempNode = head;
            while(currentIndex != index) {
                tempNode = tempNode.next;
                currentIndex ++;
            }
            return tempNode;
        }

    }

    public int getNodeValue(int index) {
        return this.getNode(index).val;
    }

    public void viewLinkedList() {
        Node tempNode = head;
        while(tempNode != null) {
            System.out.print(tempNode.val + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("END");
    }

    public int getSize() {
        return size;
    }



}
