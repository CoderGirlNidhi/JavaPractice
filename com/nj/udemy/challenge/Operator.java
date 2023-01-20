package com.nj.udemy.challenge;

public class Operator {

    public static void main(String[] args){

        double newDoubleVar1 = 20.00d;
        double newDoubleVar2 = 80.00d;
        double newDoubleTotal = (newDoubleVar1 + newDoubleVar2) *100.00d;
        System.out.println("My Double Var Total is = " + newDoubleTotal);

        double myReminderValue = newDoubleTotal % 40.00d ;
        System.out.println(" The result of teh reminder operator is = " + myReminderValue);

        boolean  resultReminder = (myReminderValue == 0) ? true : false;
        System.out.println("There is no reminder : " + resultReminder);

        if(resultReminder == false) {
            System.out.println("Got some reminder");
        }



    }
}
