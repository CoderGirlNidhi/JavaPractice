package com.nj.udemy.challenge;

class BankAccount1 {
    private long accountNo;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNo;

    public BankAccount1(String customerName, String email, String phoneNo) {
        this(101,1000,customerName , email, phoneNo);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNo = phoneNo;
    }

    public BankAccount1(long accountNo, int balance, String customerName, String email, String phoneNo ){
        System.out.println("Account constructor with parameters called");
        this.accountNo= accountNo;
        this.balance = balance;
        this.customerName= customerName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void setAccountNo (int acc) {
        this.accountNo = acc;
    }

    public BankAccount1() {
        this(56789, 500,"Default Name", "Default email", "Default phone no");// "Constructor calling Constructor" - this is calling another constructor , so the compiler jumps to the next method and
        // print and assign values
        System.out.println("Empty constructor called");
    }
    public long getAccountNo() {
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void depositFunds(int amount){
        if(amount > 0 && (Integer.MAX_VALUE - this.balance >= amount)) {
            this.balance = this.balance + amount;
            System.out.println("Deposit of " + amount + " has been made. New balance is " + this.balance);
        }else {
            System.out.println("Deposit amount should be greater than zero");
        }
    }

    // this.balace = 2000;
    // amount = 3000

    public void withdrawFunds(int amount) {
        if((amount > 0) && (this.balance >= amount)) {
            this.balance = this.balance - amount;
            System.out.println("Withdrawal of " + amount + " has been processed . Remaining balance is " + this.balance);
        }else {
            System.out.println("Only " + this.balance + " is available . Withdrawal not processesd due to insufficient funds");
        }
    }
}

public class BankChallenge {

    public static void main(String[] args) {

       BankAccount1 account1 = new BankAccount1();
//        BankAccount account1 = new BankAccount(10,100, "Nidhi", "nidhi.shisodia@gmail.com", "7972274112");

//        BankAccount account2 = new BankAccount("Gaurav", "gaurav.nidhi.jain@gmail.com", "12345");
//        System.out.println(account2.getAccountNo() + " name " + account2.getCustomerName() + account2.getBalance() + account2.getEmail() + account2.getPhoneNo());
//        account1.setAccountNo(10);
//        System.out.println(account1.getAccountNo());
//        account1.setBalance(100);
//        System.out.println(account1.getBalance());
//        account1.setCustomerName("Nidhi");
//        System.out.println(account1.getCustomerName());
//        account1.setEmail("nidhi.shisodia@gmail.com");
//        System.out.println(account1.getEmail());
//        account1.setPhoneNo("7972274112");
//        System.out.println(account1.getPhoneNo());
        account1.depositFunds(-50);
//        System.out.println(account1.getBalance());
      account1.withdrawFunds(550);
        //System.out.println("Your current balance is " + account1.getBalance());

    }
}
