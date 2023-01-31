package com.nj.udemy.practice;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] myIntArray = new int[10]; // Array Instantiation - size of teh array once declared, cnt be change.
        // we cant add opr delete any element in the array, we can only assign elements in array .

        myIntArray[5] = 50; // //assigning elements in array
//        myIntArray[0]=45.0; // java doesnt allow this , as its a double element

        myIntArray[0] = 45;
        myIntArray[1] = 1;

        double[] doubleArray = new double[20];
        doubleArray[2] = 3.5;

        System.out.println(doubleArray[2]);
        System.out.println(myIntArray[5]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First Element is : " + firstTen[0]);

        int arrayLength = firstTen.length;
        System.out.println("Length of array is " + arrayLength);

        System.out.println("Last Element is : " + firstTen[arrayLength - 1]);
        System.out.println();

        //int[] newArray = {5,4,3,2,1};  We can write this as well
        int[] newArray;
        //  newArray = new int[] {5,4,3,2,1,}; //
        newArray = new int[5]; // default value is assigned in the array = 0,0,0,0,0
        System.out.println(newArray.length);

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i; //descending order printing of array
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        //Advanced For Loop = For Each Loop :
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
//        System.out.println(newArray  );
        System.out.print(Arrays.toString(newArray));
        System.out.println();
        Object objectVar = newArray;
        if (objectVar instanceof int[]) {
            System.out.println("Object Variable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
        System.out.print(Arrays.toString(objectArray));
    }
}
