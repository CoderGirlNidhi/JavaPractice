package com.nj.udemy.practice.arrayquestions;

// Removing duplicate elements from sorted and unsorted array in 3 different ways :
//1)Sorted array with new temp array (last elements replaced by 0)
//2)Sorted array with same array (last elements replaced by 0)
//3)HashSet - best method

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemovingDuplicateElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5, 5}; // sorted array
        int[] b = {1, 2, 3, 2, 5, 4, 5}; //unsorted array
//        removeDuplicate1(b);
        removeDuplicate2(a);
    }
//Dnt want to create new array:
    public static void removeDuplicate1(int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : b) {
            set.add(i);
        }
        for (int i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The size of the new array is : " + set.size());
//        System.out.println(set);
    }


//    For sorted Array and with new Array
    public static void removeDuplicate2(int[] a) {

        int[] temp = new int[a.length]; // not needed if not taking new array
        int j = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j] = a[i]; // a[j] = a[i];
                j++;
            }
        }
        temp[j] = a[a.length - 1]; // a[j] = a[a.length -1]

        for (int i = 0 ; i < temp.length ; i++) { //i < j+1
            System.out.print(temp[i] + " "); //a[i]
        }
    }
}
