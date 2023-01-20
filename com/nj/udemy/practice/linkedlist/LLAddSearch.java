package com.nj.udemy.practice.linkedlist;

public class LLAddSearch {
    private Node head;
    private int size;
    LLAddSearch() {
        size = 0;
    }

    public static void main(String[] args) {
        LLAddSearch list = new LLAddSearch();
        list.addNode(1);
        list.addNode(5);
        list.addNode(7);
        list.addNode(3);
        list.addNode(8);
        list.addNode(8);
        list.addNode(2);
        list.addNode(3);
        System.out.println("\nSize of the list is: " + list.getSize());
        System.out.println("\nIndex of 7 is: " + list.findNodeIndex(7));
        System.out.println();

//        list.addNodeAtIndex(10, 5);
        list.deleteNode(8);
    }

    public void addNode(int data) {
        // Print list before and after adding the new Node
        System.out.println("\nAdding " + data + " to list.");
        printList();
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            printList();
            return;
        }

        //Traverse
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        size++;
        printList();
    }

    public void addNodeAtIndex(int data, int index) {
        // Add a node with value n at the index i, and print the list before and after.
        // If index < 0 or >= size of the list, print error message.

        printList();
        System.out.println("Adding " + data + " to list at " + index + " index");

        if(index < 0 || index >= size) {
            System.out.println("Error : Invalid index given");
        }

        Node newNode = new Node(data);
        if(head == null || index == 0) {
            newNode.next = head ;
            head = newNode;
            return;
        }

        //Traverse
        Node currNode = head;

        for( int i = 1; i < size ; i++ ) {
            if (index == i ) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                nextNode.next = nextNode;
            }
            currNode = currNode.next;
        }
        printList();

    }

    public int findNodeIndex(int data) {
        // Return index of first node that matches value = n. Tip: head has index 0;
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        Node currNode = head;
        for (int i = 0; i < size; i++) {
            if (currNode.data == data) {
                return i;
            }
            currNode = currNode.next;
        }
        System.out.print("Node not found in the list");
        return -1;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        //Traverse
        System.out.print(head.data);
        Node currNode = head.next;
        while (currNode != null) {
            System.out.print(" -> " + currNode.data);
            currNode = currNode.next;
        }
        System.out.println();
    }

    public void deleteNode(int data) {
        // Print error if Node with n value is not found.
        // Else delete that Node, and print the list before and after.
        printList();
        if(head == null) {
            System.out.println("List is empty , nothing to delete");
            return;
        }

        //Traverse
        Node previous, slow, fast;
        previous = slow = fast = head;

        while(fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        previous.next = slow.next;

        printList();
    }

    public int getSize() {
        return size;
    }
}
