package com.nj.udemy.challenge;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }
        int ld1 = a % 10;
        int ld2 = b % 10;
        int ld3 = c % 10;

        return (ld1 == ld2) || (ld2 == ld3) || (ld1 == ld3);
    }

    public static boolean isValid(int m) {
       return (m >= 10 && m <= 1000);
    }
}

