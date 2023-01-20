package com.nj.udemy.practice.search;

public class LinearSearchII {
    public static void main(String[] args) {
        int[] input = {12, 54, 45, 37, 98, 11, 54, 112, 34, 54};
        System.out.println(LinearSearchII.searchNumberFreq(input, 54)); // Should return 3
        System.out.println(LinearSearchII.searchNumberFreq(input, 55)); // Should return -1
        System.out.println(LinearSearchII.searchNumberFreq(input, 37)); // Should return 1
    }

    //  Given an unsorted array of size 10 with NON-DISTINCT positive numbers, find if a number exists in it or not.
    //  If it exists in the array, return that the frequency of that number, otherwise return -1.
    public static int searchNumberFreq(int[] input, int n) {
        int count = 0;
        for(int i = 0; i < input.length ; i++) {
            if (n == input[i]) {
                count++;
            }
        }

        return count == 0 ? -1 : count;
    }
}
