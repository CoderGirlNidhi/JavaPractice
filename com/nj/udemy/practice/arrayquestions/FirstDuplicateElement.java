package com.nj.udemy.practice.arrayquestions;

//Finding first duplicate element in array through 1)brute force , 2) Set1, HashSet 3) Mapping , HashMap

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateElement {
    public static void main(String[] args) {
        int[] a = {6,5,3,2,5,1,2,4};
//        firstDuplicate(a);
//        firstDuplicateElement(a);
        firstDuplicateElement2(a);
    }

    public static void firstDuplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = 0;
            for (int j = i+1 ; j < a.length; j++) {
                if(a[i] == a[j]) {
                    System.out.println("The first duplicate element is " + a[i]);
                    temp ++;
                    break;
                }
            }
            if(temp > 0){
                break;
            }
        }
    }

    public static void firstDuplicateElement(int[] a) {
        Set<Integer> set = new HashSet<>();
        for(int i : a) {
            if(!set.add(i)) {
                System.out.println("First Duplicate Element is " + i);
                break;
            }
        }
    }

    public static void firstDuplicateElement2(int[] a) {
        HashSet<Integer> hashset = new HashSet<>();
        int temp = -1;
        for (int i = a.length-1 ; i >= 0; i--) {
            if(hashset.contains(a[i])) {
//                System.out.println("First duplicate element is " + a[i]);
//                break;
                temp = i;
            }else {
                hashset.add(a[i]);
            }
        }
        if(temp != -1) {
            System.out.println("First duplicate element is " + a[temp] + " at " + temp + " index.");
        }else {
            System.out.println("No duplicate element found");
        }
    }
}
