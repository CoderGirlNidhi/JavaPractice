package com.nj.udemy.practice.inheritance;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;
    public Dog() {
        super("Mutt", "Big", 50); // size = big
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();    // from template available we choose this option so as to print all the values from dog class as well as from super
//         Animal's class as well.
    }

     //earlier without mentioning this , it was doing the same thing which was declared in Animal class
        // but now after giving its own syntax, it is not doing anything as we havnt given any statements inside this method.

    //    Overriding Method
    public void makeNoise() {
        if(type == "Wolf") {
            System.out.println("Ow Waaooo");
        }
            bark();
        System.out.println();
    }
    @Override // reminidng we are overriding a method here
    public void move(String speed) {
        super.move(speed); // will call the move method in Animal Class(parent class)

//        System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow") {
            walk();
            wagTail();
        }else {
            run();
            bark();
        }

        System.out.println();
    }
 // Below are all Dog's class own methods :

    private void bark() {
        System.out.print("Woof !");
    }

    private void run() {
        System.out.print("Dog Running !");
    }

    private void walk() {
        System.out.print("Dog Walking !");
    }

    private void wagTail() {
        System.out.print("Dog Tail Wagging !");
    }
}
