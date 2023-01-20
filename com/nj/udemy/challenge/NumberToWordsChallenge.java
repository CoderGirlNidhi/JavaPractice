package com.nj.udemy.challenge;

public class NumberToWordsChallenge {
    public static void main(String[] args) {

//        numberToWords(1234);
         System.out.println(reverse(-123));
        //System.out.println(getDigitCount(100));
    }

    public static void numberToWords(int n) {
        if (n < 0) {
            System.out.println("Invalid Value");
            return ;
        }

        int r = reverse(n);
        int c = getDigitCount(n);

        while(r > 0) {
            int ld = r % 10;
            r = r / 10;
            System.out.print(digitToString(ld) + " ");
            c--;
        }
        for(int i =0 ; i < c; i++ ){
            System.out.print(digitToString(0) + " ");
        }

    }

    public static int reverse(int r) {
        System.out.println("Original: " + r);
//        boolean isNegative = false;
//        if (r < 0) {
//            isNegative = true;
            r = Math.abs(r);
//        }


        int reverse = 0;
        while (r > 0) {
            int ld = r % 10;
            r = r / 10;
            reverse = (reverse * 10) + ld;
        }
        System.out.println("Reverse: " + reverse);

//        if (isNegative) {
//            reverse = reverse * -1;
//        }
        return reverse;
    }

    public static String digitToString(int n) {

        switch (n) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Invalid";
        }
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }
       return count;
    }
}
