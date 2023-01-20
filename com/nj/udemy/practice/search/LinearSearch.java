package com.nj.udemy.practice.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] input = {12, 23, 45, 37, 98, 11, 54, 112, 34, 20};
        System.out.println(LinearSearch.searchNumber(input, 54)); // Should return 54
        System.out.println(LinearSearch.searchNumber(input, 55)); // Should return -1
    }

    //  Given an unsorted array of size 10 with distinct positive numbers, find if a number exists in it or not.
    //  If it exists in the array, return that number, otherwise return -1.
    public static int searchNumber(int[] input, int n) {
        for(int i = 0; i < input.length ; i++) {
            if (n == input[i]) {
                return input[i];
            }
        }
        return -1;
    }
}
