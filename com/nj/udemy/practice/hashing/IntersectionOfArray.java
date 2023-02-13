package com.nj.udemy.practice.hashing;

import java.util.HashSet;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] a = {7,3,9};
        int[] b = {6,3,9,2,9,4};
        intersection(a, b);
    }

    public static void intersection(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0 ; i < a.length; i++) {
            for (int j = 0 ; j < b.length; j++) {
                if(a[i] == b[j]) {
                    set.add(a[i]);
                }
            }
        }
        System.out.println(set);
        System.out.println("No of Intersection elements are " + set.size());
    }

}
