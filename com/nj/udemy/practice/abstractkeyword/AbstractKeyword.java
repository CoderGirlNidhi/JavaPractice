package com.nj.udemy.practice.abstractkeyword;

public class AbstractKeyword {

    public static void main(String[] args) {
        Dog dog = new Dog("Husky");
        dog.eat();
        dog.breathe();
        System.out.println();

//        Bird bird = new Bird("Parrot");
//        bird.breathe();
//        bird.eat();

        Parrot parrot = new Parrot("Indian Parrot");
        parrot.fly();
        parrot.breathe();
        parrot.eat();
        System.out.println();

        Bats bats = new Bats("Bats");
        bats.breathe();
        bats.eat();
        bats.sleep();
        bats.fly();
    }
}
