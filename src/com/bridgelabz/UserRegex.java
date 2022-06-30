package com.bridgelabz;

import java.util.Scanner;

public class UserRegex {

    Scanner scanner = new Scanner(System.in);
    UserDetails userDetails = new UserDetails();
    public void userFirstName() {
        System.out.println("Enter Your First Name : ");
        String firstName = scanner.next();
        userDetails.firstName(firstName);
    }
    public void userLastName() {
        System.out.println("Enter Your Last Name : ");
        String lastName = scanner.next();
        userDetails.firstName(lastName);
    }
    public void userEmail() {
        System.out.println("Enter Your email : ");
        String email = scanner.next();
        userDetails.email(email);
    }
    public void userMobile() {
        System.out.println("Enter Your mobile : ");
        String mobile = scanner.next();
        userDetails.mobile(mobile);
    }
}