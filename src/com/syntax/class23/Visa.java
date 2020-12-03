package com.syntax.class23;

public class Visa {
    double balance, interest, result;
    double calcInt(){
        result = (balance/interest) * 100;
        return result;
    }
}
