package com.nj.udemy.practice.arrayquestions;

//Find common elements in 3 given arrays with sorted list

import java.util.ArrayList;
import java.util.HashSet;

public class CommonElementsInThreeArrays {
    public static void main(String[] args) {
        int[] a = {2,4,8}; // 1 element appearing max 2 times in the list
        int[] b = {2,3,4,8,10,16};
        int[] c = {2,8,14,40};
        hashsetM1(a,b,c);
    }

    public static void hashsetM1(int[] a , int[] b , int[] c) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                list.add(a[i]);
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }
        for (int no : list) {
            System.out.println(no);
        }
    }
}
