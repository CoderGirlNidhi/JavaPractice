package com.nj.udemy.practice.tree;


public class CountOfNodes {

    static class Node {
        int data;
        int height;
        int diameter;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    int index = -1;

    private Node builtTree(int[] nodes) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = builtTree(nodes);
        newNode.right = builtTree(nodes);

        return newNode;
    }

    private static int countOfNodes(Node root) {

        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    private static int sumOfNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int leftNodeSum = sumOfNodes(root.left);
        int rightNodeSum = sumOfNodes(root.right);

        return leftNodeSum + rightNodeSum + root.data;
    }

    private static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftTreeHeight = heightOfTree(root.left);
        int rightTreeHeight = heightOfTree(root.right);

        return Math.max(leftTreeHeight, rightTreeHeight) + 1;
    }

    private static int diameterOfTree(Node root) { //    Through root, time complexity is o(n*n)
        if (root == null) {
            return 0;
        }

        int diaLeft = diameterOfTree(root.left);
        int diaRight = diameterOfTree(root.right);
        int diameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diameter, Math.max(diaLeft, diaRight));
    }

    public static void calculateHeightAndDiameter(Node root) {
        if (root == null) {
            return;
        }

        calculateHeightAndDiameter(root.left);
        calculateHeightAndDiameter(root.right);

        int leftHeight = root.left == null ? 0 : root.left.height;
        int rightHeight = root.right == null ? 0 : root.right.height;
        root.height = Math.max(leftHeight, rightHeight) + 1;

        int leftDiameter = root.left == null ? 0 : root.left.diameter;
        int rightDiameter = root.right == null ? 0 : root.right.diameter;
        root.diameter = Math.max(Math.max(leftDiameter, rightDiameter), leftHeight + rightHeight + 1);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        CountOfNodes tree = new CountOfNodes();
        Node root = tree.builtTree(nodes);
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(heightOfTree(root));
        System.out.println(diameterOfTree(root)); //through root
        calculateHeightAndDiameter(root);
        System.out.println("Test");
    }
}
