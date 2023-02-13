package com.nj.udemy.practice.arrayquestions;

//Find the missing element in array
// 1)ArraySum   2)Xor

public class MissingElement {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};
//        missingNoArraySum(a);
        missingNoXor(a);
    }

    public static void missingNoArraySum(int[] a) {
        int expected_no_of_elements = a.length+1;
        int total_sum = expected_no_of_elements * (expected_no_of_elements +1) /2;
//        System.out.println(total_sum);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Missing number is " + (total_sum - sum));
    }

    public static void missingNoXor(int[] a) {
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            xor ^= a[i];
        }
        for (int i = 1; i <= (a.length + 1); i++) {
            xor ^= i;
        }
        System.out.println("Missing element is " + xor);
    }
}
