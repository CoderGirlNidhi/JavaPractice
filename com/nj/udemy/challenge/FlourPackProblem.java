package com.nj.udemy.challenge;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1,0, 4));
        System.out.println(canPack(1,0, 5));
        System.out.println(canPack(0,5, 4));
        System.out.println(canPack(2,2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // input validation
        if (goal < 0 || bigCount < 0 || smallCount < 0) {
            return false;
        }
        int bigPack = goal / 5;

//        int count =0;
//        if(bigPack < bigCount ) {
//            count = bigPack;
//        } else {
//            count = bigCount;
//        }

        int count = Math.min(bigPack, bigCount);

        goal = goal - (5 * count);

        if (smallCount >= goal) {
            return true;
        }
        return false;
    }
}
