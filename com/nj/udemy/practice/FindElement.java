package com.nj.udemy.practice;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        findElement();
    }

    public static void findElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows you want to print :");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns you want to print :");
        int cols = sc.nextInt();
        int[][] nums = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number that you are looking for :");
        int target = sc.nextInt();

        int[][] resultArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (nums[i][j] == target) {
                    System.out.println("Match found at location ( " + i + "," + j + ")");
                }
            }
        }
    }
}
