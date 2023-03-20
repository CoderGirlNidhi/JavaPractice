package com.nj.leetcode.linkedlist;

//3 tep strategy :
// 1. Find middle pf LL
// 2) reverse the second LL and
// 3) compare with 1st part of LL one by one

public class PalindromeLinkedList {
    static Node head;
    static class Node {
        int val;
        Node next;

        public Node (int val) {
            this.val = val;
            this.next = null;
        }
    }
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

//        Finding Middle-Step 1
        Node middle = findMiddle(head); // find half's end node

//        Step 2 - Find reverse of LL
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart= head;
        while (secondHalfStart != null) {
            if(firstHalfStart.val != secondHalfStart.val) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    public static Node findMiddle(Node head) {
        Node hare = head;
        Node turtle = head;

        while( hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public static Node reverse(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node curr = head;
        Node next = null;
        Node prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.println();
    }


        public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node (1);
        System.out.println("Given Linked List : ");
        list.printList(head);
        System.out.println(list.isPalindrome(head));

    }
}
