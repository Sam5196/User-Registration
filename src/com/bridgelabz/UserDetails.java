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
        regex = "/^([+]\\d{2}[ ])?\\d{10}$/";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobile);
        if (matcher.matches()) {
            System.out.println("Input follows required regex");
        } else {
            System.out.println("Sorry!! Input doesn't follow required regex");
        }
    }
}