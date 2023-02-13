package com.nj.udemy.practice.arrayquestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {10,20,30};
        int[] b = {10,30,40,50,60,70,80};
//        mergeArray(a,b);
        mergeArray2(a,b);

    }

    public static void mergeArray(int[] a, int[] b ) {

//        int a_length = a.length;
//        int b_length = b.length;
//        int c_length = a_length + b_length;
        int[] c = new int[a.length + b.length];
        int j = 0;

        for (int i = 0 ; i < a.length; i++) {
            c[j] = a[i];
            j++;
        }
        for (int i = 0; i < b.length; i++) {
           c[a.length + i ] = b[i]; // c[j] = b[i]; //
            j++;
        }
        System.out.println(Arrays.toString(c));
    }

    public static void mergeArray2(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int k = 0;
        int i = 0, j =0;
        while(i < a.length && j < b.length) {
                if(a[i] == b[j]) {
                    c[k] = a[i];
                    i++; k++;
                    c[k] = b[j];
                    j++; k++;
                } else if (a[i] < b[j]) {
                    c[k] = a[i];
                    k++; i++;
                }else {
                    c[k] = b[j];
                    k++; j++;
                }
            }
        System.out.println(Arrays.toString(c));
        }

    }
