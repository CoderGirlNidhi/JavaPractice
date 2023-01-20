package com.nj.udemy.challenge;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        // 4, 9, 0, 10, -1
    }

    public static int sumFirstAndLastDigit(int numb) {
        if(numb < 0) {
            return -1;
        }
        int sum = (numb % 10);

        while(numb > 0) {
            int lastdigit = numb % 10;
            numb = numb / 10;
            if(numb == 0) {
                sum = sum + lastdigit;
            }
        }
        return sum;
    }
}
