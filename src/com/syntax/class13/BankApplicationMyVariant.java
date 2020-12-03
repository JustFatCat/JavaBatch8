package com.syntax.class13;

import java.util.Scanner;

public class BankApplicationMyVariant {
    public static void main(String[] args) {
        AccountMyVariant burjusAccount = new AccountMyVariant();
        burjusAccount.accountId = "123";
        burjusAccount.userName = "Burju";
        burjusAccount.password = "pass123";
        burjusAccount.balance = 1000000;
        burjusAccount.typeOfAccount = "checking";
        burjusAccount.limit = 125;


        boolean isLoggedIn = burjusAccount.login("Burju", "pass123");

        if (isLoggedIn) {
            System.out.println("Welcome to Syntax bank");
        } else {
            System.out.println("Invalid user name or password");
        }

        AccountMyVariant eliasAccount = new AccountMyVariant();
        eliasAccount.accountId = "125";
        eliasAccount.userName = "Elias";
        eliasAccount.password = "pass123";
        eliasAccount.typeOfAccount = "saving";
        eliasAccount.limit = 100;

        int amountToTransfer;

        if (isLoggedIn) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter an amount you want to transfer");
            amountToTransfer = input.nextInt();
            burjusAccount.withdrawFounds(amountToTransfer);
            //eliasAccount.withdrawFounds(amountToTransfer);
        }
    }
}
