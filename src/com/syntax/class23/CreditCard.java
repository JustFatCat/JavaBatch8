package com.syntax.class23;

public class CreditCard {
    double balance, interest;
    public CreditCard(double balance, double interest){
        this.balance = balance;
        this.interest = interest;
    }

    double calcInt(){
        return balance*interest;

    }
}
