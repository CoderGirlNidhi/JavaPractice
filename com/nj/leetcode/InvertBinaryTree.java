package com.nj.leetcode;

public class InvertBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static int index = -1;
    public static TreeNode builtTree(int[] nodes) {

        index++;
        if(index >= nodes.length ) {
            return null;
        }
        if(nodes[index] == -1 ) {
            return null;
        }

        TreeNode newNode = new TreeNode(nodes[index]);
        newNode.left = builtTree(nodes);
        newNode.right = builtTree(nodes);

        return newNode;
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode l = invertTree(root.left);
        TreeNode r = invertTree(root.right);

        root.right = l;
        root.left = r;

        return root;
    }

    public static void traverse(TreeNode n) {
        if (n == null) return;
        System.out.print(n.val + " ");
        traverse(n.left);
        traverse(n.right);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        TreeNode root = builtTree(nodes);
        traverse(root);
        root = invertTree(root);
        System.out.println();
        traverse(root);
    }
}
