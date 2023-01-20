package com.nj.udemy.challenge;

public class PrimitiveType {

    public static void main (String[] args) {

        byte newByteValue = 100;
        short newShortValue = 1000;
        int newIntValue = 400000;

        long newLongValue = 50000L + 10L * (newByteValue + newShortValue + newIntValue);
        System.out.println("My New Long Value is equal to " + newLongValue);

        short shortTotal = (short) (1000 + 10 * (newByteValue + newShortValue + newIntValue));


    }
}
