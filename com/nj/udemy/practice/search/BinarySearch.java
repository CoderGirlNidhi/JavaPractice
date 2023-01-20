package com.nj.udemy.practice.search;

import com.nj.leetcode.LCBinarySearch;

import java.util.Arrays;
//

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = {12, 23, 45, 37, 98, 11, 54, 112, 34, 20};
        System.out.println(searchNumberBinaryII(input, 54)); // Should return 54
        System.out.println(searchNumberBinaryII(input, 55)); // Should return -1
    }

    //  Given an unsorted array of size 10 with distinct positive numbers, find if a number exists in it or not using
    //  binary search methods of Arrays class . If it exists in the array, return that number, otherwise return -1.
    public static int searchNumberBinary(int[] input, int n) {
        Arrays.sort(input);
       if(Arrays.binarySearch(input, n) >= 0){
           return n;
       }
       return -1;
    }


    //  Given an unsorted array of size 10 with distinct positive numbers, find if a number exists in it or not, without
    //  using binary search. If it exists in the array, return that number, otherwise return -1.
    public static int searchNumberBinaryII(int[] input, int n) {
        Arrays.sort(input);
        int index = LCBinarySearch.search(input, n);
        if(index == -1) {
            return -1;
        }
        return n;
    }
}
