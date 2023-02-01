package com.nj.udemy.practice.finalkeyword;

public class Password {

    private static final int key = 251381;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    public int getEncryptedPassword() {
        return encryptedPassword;
    }

    public int encryptDecrypt(int password) {
        return password ^ key;
    }

    public void storePassword() {
        System.out.println("Saving password as " + encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if( encryptDecrypt(password) ==  this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        }else {
            System.out.println("Nope, you cannot come in ");
            return false;
        }
    }
}
