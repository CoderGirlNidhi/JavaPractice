package com.nj.udemy.practice.arrayquestions;

// Insert any element in array

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        insertElement (a);
    }

    public static void insertElement(int[] a) {

        int pos = 3; //this is position no not the index value.
        int element = 100; // this is the element that we will be inserting in array

        for (int i = a.length - 1; i > pos-1 ; i--) {
                a[i] = a[i -1];
        }
        a[pos - 1] = element;

        System.out.println(Arrays.toString(a));
    }
}





