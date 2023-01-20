package com.nj.udemy.challenge.bank;

public class Bank {
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