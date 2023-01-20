package com.nj.udemy.practice;

public class SwitchChallenge {
    public static void main(String[] args) {
        char newVar = 'b';
        switch (newVar) {
            case 'A': case 'B': case 'C': case 'D': case 'E' :
                System.out.println("Found value is " + newVar);
                break;
            default :
                System.out.println("Char not found");
                break;

        }

        String month= "MAy" ;

        switch(month.toLowerCase()) {   // YOu can either convert entire string in lower or upper cse so that you can check your string
            case "jan" : case "feb" : case "may" : case " june" :
                System.out.println("Month found");
                break;

            default :
                System.out.println("Not Sure");
                break;
        }

//        int value= 3;
//        if (value == 1) {
//            System.out.println("Value was 1 ");
//        } else if (value == 2) {
//            System.out.println("Value was 2 ");
//        }else {
//            System.out.println("Value was not 1 or 2 ");
//        }

        int switchValue = 5;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3 or 4 or 5");
                System.out.println("Actually it was a + " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }
    }
}