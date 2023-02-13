package com.nj.udemy.practice.arrayquestions;

import java.util.Arrays;

public class AddingTwoMatrices {

    public static void main(String[] args) {
        int[][] a = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int[][] b = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};
        addingMatrices(a,b);
    }

    public static void addingMatrices(int[][] a, int[][] b) {

        int[][] c = new int[a.length][b.length];

        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
