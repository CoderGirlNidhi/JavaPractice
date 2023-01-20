package com.nj.udemy.challenge;

public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit (12, 23));
        System.out.println(hasSharedDigit (9, 99));
        System.out.println(hasSharedDigit (15, 55));
        System.out.println(hasSharedDigit (90, 99));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }
        int ld1, ld2, tempB = b;

        while (a > 0) {
            ld1 = a % 10;
            a = a / 10;
            b = tempB;
            while (b > 0) {
                ld2 = b % 10;
                b = b / 10;
                if (ld1 == ld2) {
                    return true;
                }
            }
        }
        return false;
    }
}

