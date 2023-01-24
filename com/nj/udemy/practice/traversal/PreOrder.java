package com.nj.udemy.practice.traversal;

public class PreOrder {
    public static void main(String[] args) {
        Node1 n1 = new Node1(1);
        Node1 n2 = new Node1(2);
        Node1 n3 = new Node1(3);
        Node1 n4 = new Node1(4);
        Node1 n5 = new Node1(5);
        Node1 n6 = new Node1(6);
        Node1 n7 = new Node1(7);
        Node1  n8 = new Node1(8);
        Node1 n9 = new Node1(9);
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

    public static void traverse(Node1 n) {
        if (n == null) return;
        System.out.print(n.value + " ");
        traverse(n.left);
        traverse(n.right);
    }

}



class Node1 {
    public int value;
    public Node1 left;
    public Node1 right;

    public Node1(int value) {
        this.value = value;
    }
}
