package com.nj.udemy.practice.hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOf2Arrays {
    public static void main(String[] args) {
        int[] a = {7,3,9};
        int[] b = {6,3,9,2,9,4};
        union(a,b);
    }

    public static void union(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();

        for (int i : a) {
            if(set.add(i)) {
            }
        }
        for (int j : b) {
            if (set.add(j)) {
            }
        }

        System.out.println(set);
        System.out.println("Total no of elements are " + set.size());

    }
}
