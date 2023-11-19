package com.thiru;

public class DoublyLinkedList {
    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
            this.prev = null;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node head;



    public void insertFirst(int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        }
        Node tempNode = head;
        while(tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        newNode.prev = tempNode;
    }

    public void insertAtIndex(int val,int index){
        int currentIndex = 0;
        if (index == 0 || head == null) {
            this.insertFirst(val);
        } else {
            Node newNode = new Node(val);
            Node tempNode = head;
            while(currentIndex != index-1 && tempNode.next != null) {
                tempNode = tempNode.next;
                currentIndex += 1;
            }
            if(tempNode.next == null) {
                newNode.next = null;
                newNode.prev = tempNode;
                tempNode.next = newNode;
                return;
            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode.next.prev;
            tempNode.next.prev = newNode;
            tempNode.next = newNode;
        }
    }
    public String deleteFirst() {
        if(head == null) {
            return "null";
        } else if(head.next == null){
            int deletedValue = head.val;
            head = null;
            return Integer.toString(deletedValue);
        } else {
            int deletedValue = head.val;
            head = head.next;
            head.prev = null;
            return Integer.toString(deletedValue);
        }

    }
    public String deleteLast() {
        if(head == null) {
            return "null";
        } else if(head.next == null){
            int deletedValue = head.val;
            head = null;
            return Integer.toString(deletedValue);
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            int deletedValue = tempNode.val;
            tempNode.prev.next = null;
            return Integer.toString(deletedValue);
        }

    }

//    public void deleteAtIndex(int index) {
//        if(head.next == null || index <= 0) {
//            this.deleteFist();
//            return;
//        } else if (index == size || index > size) {
//            this.deleteLast();
//            return;
//        }
//        int currentIndex = 1;
//        Node current =  head.next;
//        Node previous = head;
//
//        while(index != currentIndex) {
//            currentIndex ++;
//            previous = current;
//            current = current.next;
//        }
//        size --;
//        previous.next = current.next;
//    }
//
//    public Node getNode(int index) {
//        if(index == 0) {
//            return  head;
//        } else {
//            int currentIndex = 0;
//            Node tempNode = head;
//            while(currentIndex != index) {
//                tempNode = tempNode.next;
//                currentIndex ++;
//            }
//            return tempNode;
//        }
//
//    }
//
//    public int getNodeValue(int index) {
//        return this.getNode(index).val;
//    }

    public void viewDoublyLinkedList() {
        Node tempNode = head;
        while(tempNode != null) {
            System.out.print(tempNode.val + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("END");
    }

//    public int getSize() {
//        return size;
//    }
}
