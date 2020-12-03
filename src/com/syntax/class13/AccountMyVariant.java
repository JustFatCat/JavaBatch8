package com.syntax.class13;

import java.util.Scanner;

public class AccountMyVariant {
    String accountId;
    String userName;
    String password;
    double balance;
    String typeOfAccount;
    double limit;

    //write a method that takes the amount that user wants to transfer
    //transfer it deducts the amount from your balance and
    //returns the amount of transfer in case of success or 0 in case of failure
    //we can use scanner

    boolean login(String enteredUserName, String enteredPassword){
        if(userName.equals(enteredUserName) && password.equals(enteredPassword)) {
            return true;
        } else{
            return false;
        }
    }

    void withdrawFounds(int amountToTransfer){
        double resultAmount;
        resultAmount = balance - amountToTransfer;
        if (resultAmount > 0) {
            System.out.println("You can transfer this amount: " + amountToTransfer + ". The amount on your account became: " + resultAmount);
        } else {
            System.out.println("Something goes wrong");
        }
    }





}
