package com.nj.udemy.practice.linkedlist;



class LL {
    Node head;
    private int size ;

    LL () {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;

            size++;
        }
    }

    // ADD - first , last

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add - last

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currNode = head; // to traverse through the list
       while(currNode.next != null) {
           currNode = currNode.next;
        }
       currNode.next = newNode;
    }

    //Print:

    public void printList() {

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head; // to traverse through the list
        while(currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;

        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is"); //head

        list.printList();

        list.addLast("list");
        list.printList();

//        list.deleteFirst();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();

        System.out.println(list.getSize());

        list.addFirst("This");
        list.printList();
        System.out.println(list.getSize());


    }
}
