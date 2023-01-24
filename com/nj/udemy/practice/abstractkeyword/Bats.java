package com.nj.udemy.practice.abstractkeyword;

public class Bats extends Animal implements CanFly{
    public Bats(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing");
    }

    public void sleep()
    {
        System.out.println(getName() + " sleeps in only daytime");
    }


    @Override
    public void fly() {
        System.out.println("Though I am an animal , i can fly high ");
    }
}
