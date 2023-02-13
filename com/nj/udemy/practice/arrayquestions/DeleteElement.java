package com.nj.udemy.practice.arrayquestions;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] a = {10, 40, 30, 80, 60, 20};
        deleteElement(a);
        deleteElement1(a);
    }

    public static void deleteElement(int[] a) {

        int pos = 20;

        for (int i = pos-1; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    public static void deleteElement1(int[] a) {

        int delete_element = 30;
        for (int i = 0; i < a.length; i++) {
            if (delete_element == a[i]) {
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                break;
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
