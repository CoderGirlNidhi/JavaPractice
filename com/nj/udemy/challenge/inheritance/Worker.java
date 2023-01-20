package com.nj.udemy.challenge.inheritance;

public class Worker {

    protected String name;
    private String birthDate;
    private String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
            int currentYear = 2022;
            int birthDate = Integer.parseInt(this.birthDate.substring(6));
            return currentYear - birthDate;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate= endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
