package com.nj.udemy.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildPreOrder {
     static class Node {
        int data;
        Node left;
        Node right;

         Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

//    private Node root;
    private int index = -1;

    private Node buildTree(int[] nodes) {
        index++;
        if(index >= nodes.length || nodes[index] == -1){
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
    public static void preOrder(Node root) {
        if(root == null) {
            System.out.print("-1 ");
            return ;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            System.out.print("-1 ");
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void postOrder(Node root) {
        if(root == null) {
            System.out.print("-1 ");
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
            System.out.print(root.data + " ") ;

    }

//BFS - Breadth First Search
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currentNode = q.remove();
            if(currentNode == null) {
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                System.out.print(currentNode.data + " ");
                if(currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if(currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildPreOrder tree = new BuildPreOrder();
        Node root = tree.buildTree(nodes);
        System.out.println("Pre Order Traversal : " );
        preOrder(root);
        System.out.println();
        System.out.println("In Order Traversal : " );
        inOrder(root);
        System.out.println();
        System.out.println("Post Order Traversal : " );
        postOrder(root);
        System.out.println();
        System.out.println("Level Order Traversal : " );
        levelOrder(root);

    }
}

