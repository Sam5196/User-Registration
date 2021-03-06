package com.bridgelabz;

import java.util.Scanner;

public class Main {
    UserRegex userRegex = new UserRegex();
    SampleEmail testSampleEmail = new SampleEmail();
    Scanner scanner = new Scanner(System.in);
    public void choice() {
        while (true) {
            System.out.println(
                    "Enter 1 To Verify First Name\n" + "Enter 2 To Verify Last Name\n" + "Enter 3 To Verify email\n"
                            + "Enter 4 To Verify mobile \n" + "Enter 5 To Verify Password\n" + "Enter 0 To Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    userRegex.userFirstName();
                    break;
                case 2:
                    userRegex.userLastName();
                    break;
                case 3:
                    userRegex.userEmail();
                    break;
                case 4:
                    userRegex.userMobile();
                    break;
                case 5:
                    userRegex.userPassword();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input \n Please enter Correct input");
                    continue;
            }
        }
    }

    public void sampleEmailIds() {
        testSampleEmail.testForValidEmails();
        testSampleEmail.testForNonValidEmails();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to user registration program");
        Main regexUserMain = new Main();
        regexUserMain.choice();
        regexUserMain.scanner.close();
    }
}
