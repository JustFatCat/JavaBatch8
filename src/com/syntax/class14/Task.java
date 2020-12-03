package com.syntax.class14;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter username:");
        String userName = input.nextLine();
        System.out.println("Please enter password ");
        String password = input.nextLine();
        String confirmedPassword = "123syntax";
        System.out.println("Please enter password ");
        confirmedPassword = input.nextLine();

        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username and password cannot be empty");
        } else {
            if (password.length() < 8) {
                System.out.println("Password is too short");
            } else {
                if (password.contains(userName)) {
                    System.out.println("Password cannot contain username");
                } else {
                    if (!password.equals(confirmedPassword)) {
                        System.out.println("Passwords don't match");
                    } else {
                        System.out.println("Your username and password has been created");
                    }

                }
            }


        }
    }
}