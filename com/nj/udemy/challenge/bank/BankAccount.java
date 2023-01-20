package com.nj.udemy.challenge.bank;

public class BankAccount {
    private String accountNo;
    private double balance;
    private String customerName;
    private String emailId;
    private String phoneNo;

    public BankAccount(){
        this("56789", 0.00,"Default name", "Default@gmail.com", "default no");
        System.out.println("Empty constructore called");
    }
// This is a way to avoid the use of setter method everytime when we assign values.
    public BankAccount(String accountNo, double balance, String customerName, String email, String phoneNo) {
        System.out.println("Account constructor with parameters called ");

        this.accountNo = accountNo; // Good practice to assign values in the field.
//        setAccountNo(accountNo); // In this way if we have put any input validation on any fields, then this is an alternative to execute the method where we have put the validations.
        // but this is a bad practice , hence , we assign values directly by using this method. hence commenting out this one.
        this.balance = balance;
        this.customerName = customerName;
        emailId = email;  // parameters passed can be of teh same name but not mandatory, hence no use of this keyword
        this.phoneNo = phoneNo;
    }


    public BankAccount(String customerName, String emailId, String phoneNo) {
        this("99999", 100.55, customerName, emailId, phoneNo);
//        this.customerName = customerName;
//        this.emailId = emailId;
//        this.phoneNo = phoneNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void depositFunds(double balance) {

        if(balance <= 0){
            System.out.println("Balance can't be negative or 0. Please enter value greater than 0. ");
        }

        if(balance > 0) {
            this.balance += balance;
            System.out.println("Amount of rupees " + balance + " has been deposited. The new balance is " + this.balance);
        }
    }

    public void withdrawFunds (double amount) {

        if(balance < 0 || amount <=0 || amount > this.balance)
        {
            System.out.println("The balance in this account is less than the withdrawal amount , hence withdrawal is not possible");
        }else
        {
            this.balance -= amount;
            System.out.println("Amount of rupees " + amount + " has been deducted. The new balance is " + this.balance);
        }

    }
}
