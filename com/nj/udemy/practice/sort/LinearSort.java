package com.nj.udemy.practice.sort;

// All numbers are positive, distinct and less than 200
public class LinearSort {
    public static void main(String[] args) {
        int[] input = {25, 71, 11, 88, 23, 19, 30, 36, 101, 42};
        int lastPrint = Integer.MIN_VALUE;
        boolean isOutputEmpty = true;

        for (int i = 0; i < 10; i++) {
            int smallest = Integer.MAX_VALUE;

            for (int j = 0; j < 10; j++) {
                if (lastPrint != Integer.MIN_VALUE && input[j] <= lastPrint) {
                        continue;
                }
                smallest = Math.min(smallest, input[j]);
            }
            lastPrint = smallest;
            System.out.println(smallest);
        }
    }
}
