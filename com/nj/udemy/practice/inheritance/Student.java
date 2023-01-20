package com.nj.udemy.practice.inheritance;

public class Student extends Human {

    private final String school;

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
}
