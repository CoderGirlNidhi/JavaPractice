package com.nj.udemy.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
       int[] intArray =  readIntegers();
       int minVal = findMin(intArray);
        System.out.println(minVal);
    }

    public static int[] commaSeparatedStringToIntegerArray(String input) {
        String[] splitArray = input.split(",");
        int[] resultArray = new int[splitArray.length];

//        System.out.println(Arrays.toString(splitArray));

        for (int i = 0; i < splitArray.length; i++){
            resultArray[i] = trimAndParse(splitArray[i]);
        }

        return resultArray;
    }

    public static int trimAndParse(String s) {
        s = s.trim();
        return Integer.parseInt(s);
    }

    public static int findMin(int[] input) {
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++) {
            value = Math.min(input[i], value);
        }
        return value;
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] resultArray = commaSeparatedStringToIntegerArray(s);
        System.out.println(Arrays.toString(resultArray));
        return resultArray;
    }
}
