package com.bridgelabz;

import java.util.Scanner;
public class UserRegex {

    Scanner scanner = new Scanner(System.in);
    UserDetails userDetails = new UserDetails();

    /**
     * Input taken from Scanner passed to method to check.
     */
    public void userFirstName() {
        System.out.println("Enter Your First Name : ");
        String firstName = scanner.next();
        userDetails.firstName(firstName);
    }
}
