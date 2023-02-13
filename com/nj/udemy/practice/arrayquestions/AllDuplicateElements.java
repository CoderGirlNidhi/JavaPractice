package com.nj.udemy.practice.arrayquestions;

//Find all duplicate elements in array

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AllDuplicateElements {
    public static void main(String[] args) {
        int[] a = {3,5,4,3,2,2,1,3,2};
        bruteForce(a);
        hashMap(a);

    }

//    Checking one element by all elements one by one
    public static void bruteForce(int[] a) {
        System.out.print("Duplicate elements are : " );
        for (int i = 0; i < a.length; i++) {
            for (int j = i+ 1; j < a.length; j++) {
                if(a[i] == a[j] && i != j) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

    public static void hashMap(int[] a) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int j : a) {
            if (map.containsKey(j)) {
                int count = map.get(j);
                count++;
                map.put(j, count);
            } else {
                map.put(j, 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : set) {
            int key = entry.getKey();
            int val = entry.getValue();
            System.out.println("Key is " + key + " , Value is " + val);
        }
    }
}
