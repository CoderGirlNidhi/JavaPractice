package com.nj.udemy.practice;

public class FloatAndDouble {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " +myMinFloatValue);
        System.out.println("Float Maximum Value = " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue= 5d / 3d;
        System.out.println("MyIntValue =" + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        double myPoundVaule= 125.685d;
        double mykiloValue = myPoundVaule * 0.45359237  ;
        System.out.println("The converted weight from Pounds to Kilos are = " + mykiloValue);

        double pi = 3.141592d;
        double anotherNumber= 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);


    }
}
