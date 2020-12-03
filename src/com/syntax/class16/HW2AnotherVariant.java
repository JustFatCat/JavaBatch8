package com.syntax.class16;

public class HW2AnotherVariant {
    boolean isPrime (int number ) {
        if(number<=1){
            return false;
        }
        boolean isPrime = true;
        for(int i=2; i<=number/2; i++){
            if(number%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;



    }
}
