package com.bridgelabz;

import java.util.Scanner;
public class Main {
    UserRegex userRegex = new UserRegex();
    Scanner scanner = new Scanner(System.in);
    public void choice() {
        while (true) {
            System.out.println("Enter 1 To Verify First Name\n"
                    + "Enter 0 To Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                    userRegex.userFirstName();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Wrong input \n Please enter Correct input");
                    continue;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to user registration program");
        Main regexUserMain = new Main();
        regexUserMain.choice();
        regexUserMain.scanner.close();
    }
}

