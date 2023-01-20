package com.nj.udemy.practice;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult () {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        if(this.secondNumber == 0){
            return 0;
        }

        return this.firstNumber / this.secondNumber;
    }

    public static void main(String[] args) {

        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(100);
        calc.setSecondNumber(50);

        System.out.println("The addition of 2 nos are " + calc.getAdditionResult());
        System.out.println("The substraction of 2 nos are " + calc.getSubtractionResult());
        System.out.println("The multiplication of 2 nos are " + calc.getMultiplicationResult());
        System.out.println("The division of 2 nos are " + calc.getDivisionResult());

        calc.setSecondNumber(0);

        System.out.println("Setting the value of the second no as 0");

        System.out.println("The addition of 2 nos are " + calc.getAdditionResult());
        System.out.println("The substraction of 2 nos are " + calc.getSubtractionResult());
        System.out.println("The multiplication of 2 nos are " + calc.getMultiplicationResult());
        System.out.println("The division of 2 nos are " + calc.getDivisionResult());

    }
}
