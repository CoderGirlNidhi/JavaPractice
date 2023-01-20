package com.nj.udemy.practice.inheritance;

public class Animal {

    protected String type; // classes in same package ave access to this type variable
    private String size;
    private double weight;

    public Animal() {

    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(this.type + " moves " + speed );
    }

    public void makeNoise() {
        System.out.println(this.type + " make some kind of noise.");
    }
}
