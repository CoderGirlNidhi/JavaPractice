package com.nj.udemy.practice.arrayquestions;

//Sum and count the nos of even and odd elements in the array

import java.util.ArrayList;

public class EvenOddNo {
    public static void main(String[] args) {
        int[] a = {8,5,10,12,3,1,4};
        evenSum(a);
        oddSum(a);
        SumCountArrayL(a);
    }

    public static void evenSum(int[] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                sum = sum + a[i];
            }
        }
        System.out.println("The sum of all even no is " + sum);
    }

    public static void oddSum(int[] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 != 0) {
                sum = sum + a[i];
            }
        }
        System.out.println("The sum of all odd no is " + sum);
    }

    public static void SumCountArrayL(int[] a) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0 ; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                list1.add(a[i]);
            }else {
                list2.add(a[i]);
            }
        }
        System.out.println("Even nos are : ");
        int sum1 = 0;
        for (int i : list1) {
            System.out.println(i);
            sum1 = sum1 + i;
        }
        System.out.println("Nos of even nos are " + list1.size());
        System.out.println("The sum of even nos are " + sum1 );
        System.out.println();

        int sum2  = 0;
        System.out.println("Odd nos are : ");
        for (int i : list2) {
            System.out.println(i);
            sum2 = sum2 + i ;
        }
        System.out.println("Nos of odd nos are " + list2.size());
        System.out.println("The sum of odd nos are " + sum2 );



    }


}
