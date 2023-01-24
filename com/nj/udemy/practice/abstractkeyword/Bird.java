package com.nj.udemy.practice.abstractkeyword;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, Breathe out, and repeat !! ");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flattering fro branch to branch");
    }
}
