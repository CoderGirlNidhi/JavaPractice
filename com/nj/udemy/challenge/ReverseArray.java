package com.nj.udemy.challenge;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        reverse(input);
        System.out.println(Arrays.toString(input));

    }

    public static void reverse(int[] input) {
        for(int i = 0,j = input.length-1; i < input.length/2; i++,j--) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }

    }
}
