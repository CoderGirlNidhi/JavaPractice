package com.nj.udemy.practice.arrayquestions;

public class FindIndexOfElement {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,9};
        indexOfElement(a);
    }

    public static void indexOfElement(int[] a) {
        int element = 8; // we have to find the index of 8 in the array
        for (int i = 0; i < a.length; i++) {
            if(a[i] == element) {
                System.out.println("The index of element " + element + " is = " + i);
            }
        }
    }
}
