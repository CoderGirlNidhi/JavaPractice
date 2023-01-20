package com.nj.udemy.challenge.inheritance;

public class Inheritance {
    public static void main(String[] args) {

        Worker intern = new Worker("Nidhi", "05/21/1994", "08/15/2022");
        System.out.println("The age of intern " + intern.name + " is " + intern.getAge());
        System.out.println();

        Employee tim = new Employee("Tim", "05/28/1990", "09/15/2022","08/15/2022");
        System.out.println(tim);
        System.out.println("Details of employee " + tim.name + " is : ");
        System.out.println("Age = " + tim.getAge());
        System.out.println("Salary = " + tim.collectPay());
        System.out.println();


        Employee gaurav = new Employee("Gaurav" , "06/15/1992","10/21/2020", "10/21/2015");
        System.out.println(gaurav);
        System.out.println("Details of employee " + gaurav.name + " is : ");
        System.out.println("Age = " + gaurav.getAge());
        System.out.println("Salary = " + gaurav.collectPay());
        System.out.println();

        SalariedEmployee nidhi= new SalariedEmployee(
                "Nidhi",
                "05/21/1994",
                "08/15/2022",
                "01/01/2018",
                7000,
                false);
        System.out.println(nidhi);
        System.out.println("Details of Salaried Employee " + nidhi.name + " is : ");
        System.out.println("Age = " + nidhi.getAge());
        System.out.println("Salary = " + nidhi.collectPay());
        System.out.println("Nidhi's Paycheck is : " + nidhi.collectPay());
        nidhi.retire();
        System.out.println("Nidhi pension check = " + nidhi.collectPay());
        System.out.println();

        HourlyEmployee marry = new HourlyEmployee("Marry", "05/05/1990", "03/10/2022", "03/10/2018",500);
        System.out.println(marry);
        System.out.println("Marry's paycheck : " + marry.collectPay());
        System.out.println("Marry's Holiday Pay: " + marry.getDoublePay());
    }

}