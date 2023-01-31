package com.nj.practice;

public class BitwiseOperators {
    private static final int NUMBER_A = 5;
    private static final int NUMBER_B = 6;

    public static void main(String[] args) {
        bitwiseAnd();
        bitwiseOr();
        bitwiseXor();
        bitwiseShiftLeft();
        bitwiseShiftRight();
        bitwiseUnsignedShiftLeft();
        bitwiseUnsignedShiftRight();
    }

    public static void bitwiseAnd() {
        System.out.print("Bitwise AND => ");
        System.out.print("A & A = " + (NUMBER_A & NUMBER_A));
        System.out.print(",  ");
        System.out.println("A & B = " + (NUMBER_A & NUMBER_B));
    }

    public static void bitwiseOr() {
        System.out.print("Bitwise OR  => ");
        System.out.print("A | A = " + (NUMBER_A | NUMBER_A));
        System.out.print(",  ");
        System.out.println("A | B = " + (NUMBER_A | NUMBER_B));
    }

    // After understanding this try this leetcode problem. (com.nj.leetcode.)
    public static void bitwiseXor() {
        System.out.print("Bitwise XOR => ");
        System.out.print("A ^ A = " + (NUMBER_A ^ NUMBER_A));
        System.out.print(",  ");
        System.out.println("A ^ B = " + (NUMBER_A ^ NUMBER_B));
    }

    public static void bitwiseShiftLeft() {
        System.out.println("\nSigned Shift Left (<<)");
        System.out.println("Shifting 5 (binary 101) by 2 bits to left = " + (NUMBER_A << 2) + " (binary 10100)");
        System.out.println("Shifting 5 (binary 101) by 1 bits to left = " + (NUMBER_A << 1) + " (binary 1010)");
        System.out.println();
    }

    public static void bitwiseShiftRight() {
        System.out.println("Signed Shift Right (>>)");
        System.out.println("Need to implement.");
        System.out.println();
    }

    public static void bitwiseUnsignedShiftLeft() {
        System.out.println("Unsigned Shift Left (<<<)");
        System.out.println("Need to implement.");
        System.out.println();
    }

    public static void bitwiseUnsignedShiftRight() {
        System.out.println("Unsigned Shift Right (>>>)");
        System.out.println("Need to implement.");
        System.out.println();
    }
}
