package com.nj.udemy.practice.inheritance;

public class Employee extends Human {

    private final String employer;

    public Employee(String name, String employer) {
        super(name);
        this.employer = employer;
    }

    public String getEmployer() {
        return employer;
    }
}
