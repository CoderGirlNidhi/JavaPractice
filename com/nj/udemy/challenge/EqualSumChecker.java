package com.nj.udemy.challenge;

public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int a, int b, int c){
        if(c== a + b ) {
            return true;
        }
        return false;
    }
}
