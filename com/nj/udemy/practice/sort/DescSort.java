package com.nj.udemy.practice.sort;

import java.util.Arrays;

public class DescSort {
    public static void main(String[] args) {
        int[] input = {23, 45, 34, 1, 87, 65};
//        System.out.println("DescSort: " + Arrays.toString(descendingSort(input))); // should return {87,45,34,23,1}
        System.out.println("Desc Sort In Place: " + Arrays.toString(descendingSortInPlace(input))); // should return {87,45,34,23,1}
    }

    // Return an array of same length as input, where all values are in descending order.
    public static int[] descendingSort(int[] input) {
        Arrays.sort(input);

        int[] resultArray = new int[input.length];
        for(int i= 0, j= resultArray.length -1; i < input.length; i++, j--) {
            resultArray[j] = input[i];
        }
        return resultArray;
    }

    // Sort the given array in descending order IN-PLACE. Don't create any new array.
    public static int[] descendingSortInPlace(int[] input) {
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        for(int i =0, j = input.length - 1; i < input.length/2; i++, j--){
            int temp = input[i];
            input[i] = input[j];
            input[j]= temp;
        }
        return input;
    }

    // Sort the given array in descending order IN-PLACE. Don't create any new array.
    public static int[] descendingSortInPlaceII(int[] input) {
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
        for(int i = 0; i < input.length / 2; i++){
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        return input;
    }
}
