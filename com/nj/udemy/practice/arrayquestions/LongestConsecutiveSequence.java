package com.nj.udemy.practice.arrayquestions;

// Find the longest consecutive sequence in an array.

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] a = {3, 9, 1, 10, 4, 20, 2};
        hashSetM1(a);
    }

    public static void hashSetM1(int[] a) {

        HashSet<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        int longest_length = 0;

        for (int i = 0; i < a.length; i++) {
            if (!set.contains(a[i] - 1)) {
                int no = a[i];
                while (set.contains(no)) {
                    no++;
                }
                if(longest_length < no - a[i])
                longest_length = no - a[i];
            }
        }
        System.out.println("Longest consecutive sequence in array is = " + longest_length);
    }
}
