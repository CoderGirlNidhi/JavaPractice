package com.nj.leetcode.linkedlist;

//https://leetcode.com/problems/reverse-linked-list/submissions/914729606/
public class ReversedLinkedList {
        static Node head;

        static class Node {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            }
        }

        /* Function to reverse the linked list */
        public Node reverse(Node node)
        {
            Node prev = null;
            Node current = node;
            Node next ;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            return prev;
        }

        public Node reverseRecursive(Node head) {
            if(head == null || head.next == null) {
                return head;
            }

            Node newHead = reverseRecursive(head.next);
            Node headNext = head.next;
            headNext.next = head;
            head.next = null;
            return newHead;

        }

        // prints content of double linked list
        void printList(Node node)
        {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        // Driver Code
        public static void main(String[] args)
        {
            ReversedLinkedList list = new ReversedLinkedList();
            list.head = new Node(85);
            list.head.next = new Node(15);
            list.head.next.next = new Node(4);
            list.head.next.next.next = new Node(20);

            System.out.println("Given linked list");
            list.printList(head);
            head = list.reverse(head);
            System.out.println("");
            System.out.println("Reversed linked list ");
            list.printList(head);
        }

}
