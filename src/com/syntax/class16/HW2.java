package com.syntax.class16;
//
public class HW2 {
    public  static void main (String[] args){
        PrimeOrNot(21);
    }

    public static void PrimeOrNot(int number){
        boolean isPrime = true;
        for(int i=2; i<number; i++){
            if(number%i==0){
                isPrime = false;
                System.out.println("Can be divided by " + i);
                break;
            }
        }
        if(isPrime){
            System.out.println("Number is prime");
        } else{
            System.out.println("Number is not prime");
        }


    }
}
