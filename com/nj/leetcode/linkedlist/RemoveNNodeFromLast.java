package com.nj.leetcode.linkedlist;

public class RemoveNNodeFromLast {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node removeNthNodeFromEnd(Node head, int n) {
        if(head == null || head.next == null) {
            return head;
        }
//        Size
        int size = 0;
        Node curr = head;
        while(curr != null) {
            curr = curr.next;
            size++;
        }

        if(n == size) {
            return head.next;
        }

        Node prev  = head;
        int indexToSearch = size - n ; //3
        int i = 1;

        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;

    }

    public int searchForNthElementFromEnd(Node head, int n ) {
        if(head == null || head.next == null) {
            return -1;
        }

        int size = 0 ;
        Node curr = head;
        while(curr != null) {
            curr = curr.next;
            size++;
        }

        if(size < n ) {
            return -1;
        }

        int indexToSearch = size - n + 1;
        curr = head;
        int i = 1;

        while(i != indexToSearch) {
            curr = curr.next;
            i++;
        }

        return curr.val;
    }

    void printList(Node node) {
        while(node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveNNodeFromLast  list = new RemoveNNodeFromLast();
        Node h = new Node(1);
        Node head = h;
        for (int i = 2 ; i <= 5; i++) {
            h.next = new Node(i);
            h = h.next;
        }

        System.out.println("Given Linked List : ");
        list.printList(head);
        System.out.println(list.searchForNthElementFromEnd(head, 2));
/*        System.out.println("After removing nTh Element form LInked List : ");
        list.removeNthNodeFromEnd(head, 2);*/
//        list.printList(head);

    }
}
