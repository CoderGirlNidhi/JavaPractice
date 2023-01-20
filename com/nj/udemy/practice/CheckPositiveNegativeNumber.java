package com.nj.udemy.practice;

public class CheckPositiveNegativeNumber {

    public static void main (String[] args) {
        checkNumber(100);
    }
    public static void checkNumber (int parameter){
        if (parameter == 0) {
            System.out.println("zero ");
        } else if (parameter > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

    }
}