package com.nj.udemy.challenge;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor (18, 15));
        System.out.println(getGreatestCommonDivisor (25, 15));
        System.out.println(getGreatestCommonDivisor (12, 30));
        System.out.println(getGreatestCommonDivisor (9, 18));
        System.out.println(getGreatestCommonDivisor (81, 153));
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) {
            System.out.println("Invalid Value");
            return -1;
        }
        int smaller = 0;
        int larger = 0;
        if (a < b) {
            smaller = a;
            larger = b;
        } else {
            smaller = b;
            larger = a;
        }

        for (int i = 1; i <= smaller; i++) {

            if (smaller % i == 0) {
                int c = smaller / i;
                if (larger % c == 0) {
                    return c;
                }
            }
        }
        return -1;
    }

}
