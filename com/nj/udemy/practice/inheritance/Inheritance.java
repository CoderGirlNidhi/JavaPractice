package com.nj.udemy.practice.inheritance;

public class Inheritance {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "huge" , 400);
        doAnimalStuff(animal, "slow" );

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast" );

        Dog yorkie = new Dog("Yorkie" , 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever" , 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever,"slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2,3);
        doAnimalStuff(goldie, "fast");


    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal); // this is calling our override toString() method in class Animal and prints out all the info about animal parameters.
        System.out.println("_________");
    }
}