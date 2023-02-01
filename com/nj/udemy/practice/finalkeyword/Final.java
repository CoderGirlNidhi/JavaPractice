package com.nj.udemy.practice.finalkeyword;

public class Final {

    public static void main(String[] args) {

        int pw = 223081;
        Password password = new ExtendedPassword(pw);


        password.letMeIn(1);
        password.letMeIn(9773);
        password.letMeIn(251381);
        password.letMeIn(223081);

    }

}
