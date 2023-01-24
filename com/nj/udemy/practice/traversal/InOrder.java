package com.nj.udemy.practice.traversal;

public class InOrder {
        public static void main(String[] args) {
            Node3 n1 = new Node3(1);
            Node3 n2 = new Node3(2);
            Node3 n3 = new Node3(3);
            Node3 n4 = new Node3(4);
            Node3 n5 = new Node3(5);
            Node3 n6 = new Node3(6);
            Node3  n8 = new Node3(8);
            Node3 n7 = new Node3(7);
            Node3 n9 = new Node3(9);
            n6.left = n2;
            n6.right = n7;
            n2.left = n1;
            n2.right = n4;
            n4.left = n3;
            n4.right = n5;
            n7.right = n9;
            n9.left = n8;

            traverse(n6);
        }

        public static void traverse(Node3 n) {
            if (n == null) return;
            traverse(n.left);
            System.out.print(n.value + " ");
            traverse(n.right);

        }
    }



    class Node3  {
        public int value;
        public Node3 right;
        public Node3 left;
        public Node3(int value) {
            this.value = value;
        }
    }
