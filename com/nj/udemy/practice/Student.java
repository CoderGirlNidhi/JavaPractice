package com.nj.udemy.practice;

public class Student {
    private String name;
    private String id;
    private String dateOfBirth;
    private String classList;

    public Student(String name, String id, String dateOfBirth, String classList) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override // annotations
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    public static void main(String[] args) {

        for(int i = 1; i <= 5 ; i++) {
            Student s = new Student("S1 " + i,
                    switch (i) {
                        case 1 -> "Marry";
                        case 2 -> "Carol";
                        case 3 -> "Tim" ;
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default ->"Anonymous";
                    }, "05/11/1994", "Java Masterclass");

            System.out.println(s);

            Student pojoStudent = new Student("S100", "harry", "21/05/1994", "Java Masterclass");



        }
    }
}
