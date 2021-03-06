package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
    public String regex;
    public void firstName(String firstName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Input follows required regex");
        } else {
            System.out.println("Sorry!! Input doesn't follow required regex");
        }
    }
    public void lastName(String lastName) {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Input follows required regex");
        } else {
            System.out.println("Sorry!! Input doesn't follow required regex");
        }
    }
    public void email(String email) {
        regex = "^[a-z0-9]+([.][a-z0-9]+)*@bl[.]co[.][a-z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Input follows required regex");
        } else {
            System.out.println("Sorry!! Input doesn't follow required regex");
        }
    }
    public void mobile(String mobile) {
        regex = "^[0-9]{2}(\s){1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobile);
        if (matcher.matches()) {
            System.out.println("Input follows required regex");
        } else {
            System.out.println("Sorry!! Input doesn't follow required regex");
        }
    }
    public void password(String password) {
        regex = "^[a-zA-Z0-9]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Input follows required regex");
        } else {
            System.out.println("Sorry!! Input doesn't follow required regex");
        }
    }
}