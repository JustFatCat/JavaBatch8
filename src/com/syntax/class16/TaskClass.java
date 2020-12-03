package com.syntax.class16;

public class TaskClass {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    public static void largerNumMethod(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else{
            System.out.println("Have no idea");
        }

    }

    //Create a method that will take a number and prints whether the number is even or odd.
    //Even are completely divisible by two
    //If number are not divisible by two - is odd
    public void oddEven(int num1, int num2) {
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even");
        } else {
            System.out.println(num1 + " is odd");
        }
        if (num2 % 2 == 0) {
            System.out.println(num2 + " is even");
        } else {
            System.out.println(num2 + " is odd");
        }
    }

    //Create a method that will print whether given String is palindrome or not.
    public static void palindrome(String str) {
        int length = str.length();
        String message;

        String word2 = "";
        for (int i = length - 1; i >= 0; i--) {
            word2 += str.charAt(i);
        }
        if (str.equalsIgnoreCase(word2)) {
            message = "The word is a palindrome";
        } else {
            message = "The word is not a palindrome";
        }
        System.out.println(message);

    }
    public void isPalindr2Variant(String string){
        int i=0;
        int j=string.length()-1;
        while(i<j){

            if(string.charAt(i)!=string.charAt(j)){
                System.out.println("String is not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("String is palindrome");
    }

    //Create a method that will say Hello in different language based on the country that will passed when method is executed.
    public static void sayHello(String country) {
        if (country.equalsIgnoreCase("Russia")) {
            System.out.println("Привет!");
        } else if (country.equalsIgnoreCase("USA")) {
            System.out.println("Hello!");
        } else if (country.equalsIgnoreCase("Germany")) {
            System.out.println("Hallo!");
        }else{
            System.out.println("I don't know");
        }

    }

    //Another variant for countries
    static void sayHello1(String countryName){
        switch(countryName){
            case "USA":
                System.out.println("Hello");
                break;
            case "China":
                System.out.println("Ni hao");
                break;
            case "Turkey":
                System.out.println("Merhaba");
                break;
            default:
                System.out.println("Country not supported");

        }
    }
}
