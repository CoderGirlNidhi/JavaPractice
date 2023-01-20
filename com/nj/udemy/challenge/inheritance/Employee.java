package com.nj.udemy.challenge.inheritance;

public class Employee extends Worker{
    private long empId;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee() {

    }

    public Employee(String name, String birthDate, String endDate, String hireDate) {
        super(name, birthDate, endDate);
        this.empId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }

    @Override
    public double collectPay() {
        return super.collectPay();
    }
}
