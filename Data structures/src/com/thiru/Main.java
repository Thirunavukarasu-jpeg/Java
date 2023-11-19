package com.thiru;


public class Main {
    public static void main(String[] args) {
//        LinkedList LL = new LinkedList();
//        System.out.println(LL);
//        LL.insertFirst(10);
//        LL.insertFirst(11);
//        LL.insertFirst(12);
//        LL.insertFirst(13);
//        LL.insertLast(9);
//        LL.insertLast(8);
//        LL.insertLast(7);
//        LL.viewLinkedList();
//
//        LL.insertAtIndex(100,3);
//
//        LL.viewLinkedList();
//        System.out.println(LL.deleteFist());
//        LL.viewLinkedList();
//        System.out.println(LL.deleteLast());
//        LL.viewLinkedList();
//        LL.deleteAtIndex(2);
//        LL.viewLinkedList();
//        System.out.println(LL.getSize());
//
//        System.out.println(LL.getNodeValue(2));

//        DoublyLinkedList DL = new DoublyLinkedList();
//        DL.insertFirst(3);
//        DL.insertFirst(2);
//        DL.insertFirst(1);
//        DL.insertLast(4);
//        DL.insertAtIndex(10,2);
//        DL.insertAtIndex(100,100);
//        DL.viewDoublyLinkedList();
//
//        System.out.println(DL.deleteFirst());
//        System.out.println(DL.deleteLast());
//
//        DL.viewDoublyLinkedList();

        CircularLinkedList CLL = new CircularLinkedList();
        CLL.insertFirst(1);
        CLL.insertFirst(2);
        CLL.insertFirst(3);

//        CLL.insertFirst(2);
//        CLL.insertFirst(3);
//        CLL.insertFirst(4);
//        CLL.insertFirst(5);
        CLL.displayCircularLinkedList();
    }
}