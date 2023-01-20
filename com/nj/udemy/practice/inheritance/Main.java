package com.nj.udemy.practice.inheritance;

public class Main {
    public static void main(String[] args) {
        Human h = new Human("Nidhi");
        Employee e = new Employee("Gaurav", "Indeed");
        Student s = new Student("Amit", "Amity");
        HonorStudent hs = new HonorStudent("Rashmi", "NIPER", 29);
    }
}