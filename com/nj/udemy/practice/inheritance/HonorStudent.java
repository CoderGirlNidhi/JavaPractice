package com.nj.udemy.practice.inheritance;

public class HonorStudent extends Student {
    private final int age;

    public HonorStudent(String name, String school, int age) {
        super(name, school);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
