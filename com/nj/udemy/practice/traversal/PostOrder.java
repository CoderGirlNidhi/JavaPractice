package com.nj.udemy.practice.traversal;

public class PostOrder {
        public static void main(String[] args) {
            Node2 n1 = new Node2(1);
            Node2 n2 = new Node2(2);
            Node2 n3 = new Node2(3);
            Node2 n4 = new Node2(4);
            Node2 n5 = new Node2(5);
            Node2 n6 = new Node2(6);
            Node2  n8 = new Node2(8);
            Node2 n7 = new Node2(7);
            Node2 n9 = new Node2(9);
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
        public static void traverse(Node2 n) {
            if (n == null){
                return;
            }
            traverse(n.left);
            traverse(n.right);
            System.out.print(n.value + " ");
        }
    }



    class Node2 {
        public int value;
        public Node2 left;
        public Node2 right;

        public Node2(int value) {
            this.value = value;
        }
    }

