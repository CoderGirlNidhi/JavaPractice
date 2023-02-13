package com.nj.udemy.practice.arrayquestions;

//Find common elements in given 2 arrays i two different ways  :
// 1)BruteForce - when the list is having unique elements , no duplicate elements
// 2)HashSet-as hashset cnt take duplicate values.

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsInTwoArrays {

    public static void main(String[] args) {
        int[] a = {4,3,7,9,2,4,8,8}; // 1 element appearing max 2 times in the list
        int[] b = {5,1,4,8,3,5};
//        bruteForce(a, b);
//        hashSetMethod(a,b);
        hashSetMethod2(a,b);
    }

//    Can only be used if the array is given with unique integers and no duplicacy in each array .
    public static void bruteForce(int[] a, int[] b) {
        System.out.print("Common elements in 2 arrays are :");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0 ; j < b.length; j++) {
                if(a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }



//    One of the best method to find the common no/ duplicate no in arrays , set of 2 arrays
    public static void hashSetMethod(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    set.add(a[i]);
                    break;//if list is having thousands of elements
                }
            }
        }
        System.out.println();
        System.out.println(set);
    }

//    Below method is possible only when we are given with list of unique elements : a= 1,2,3, b = 4,5,6,4,
//    this method will not be able to add 4, and hence will display as duplicate element in lists,
//    which in real is not a common element in these lists
    public static void hashSetMethod2(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : a) {
            set.add(i);
        }
//        System.out.println(set);

        for (int j : b) {
            boolean l =  set.add(j);
            if(!l) {
                System.out.print(j + " " );
            }
        }
    }
}
