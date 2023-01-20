package com.nj.udemy.challenge;

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

    public static void main(String[] args) {
// Initially we assign values by passing values in the constructor to make it a parameterised con.
//        BankAccount customer1 = new BankAccount("12345", 500,"Nidhi", "nidhi.shisodia@gmail.com", "7972274112");

        //Now we are using this() to see teh concept of method/ constructor overloading , where default const is called paramerterised connst
        BankAccount customer1 = new BankAccount();

//        customer1.setAccountNo("12345");   // as this is a very tedious process to always assign values using setter methods, hence we use constructors to assign the default values.
//        customer1.setBalance(100.00); // hence this has been commented out
//        customer1.setCustomerName("Nidhi Shisodia");
//        customer1.setEmailId("nidhi.shsidoia@gmail.com");
//        customer1.setPhoneNo("7972274112");

        System.out.println(customer1.getAccountNo());
        System.out.println(customer1.getBalance());
        System.out.println(customer1.getCustomerName());
        System.out.println(customer1.getEmailId());
        System.out.println(customer1.getPhoneNo());

        customer1.depositFunds(1000);
        customer1.withdrawFunds(500);
        customer1.withdrawFunds(1500);
        customer1.depositFunds(1000);
//        customer1.withdrawFunds(45.55);
//        customer1.withdrawFunds(54.46);
//        customer1.withdrawFunds(54.45);
//        System.out.println(customer1.getBalance());

        customer1.depositFunds(-50);
        customer1.depositFunds(0);

        System.out.println(customer1.getBalance());

//        BankAccount customer2 = new BankAccount("Gaurav", "gaurav.dugar@gmail.com","9829037839");
//        System.out.println(customer2.getAccountNo());
//        System.out.println(customer2.getBalance());
//        System.out.println(customer2.getCustomerName());
//        System.out.println(customer2.getEmailId());
//        System.out.println(customer2.getPhoneNo());

//        customer1.depositFunds(-50);



    }
}
