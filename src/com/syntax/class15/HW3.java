package com.syntax.class15;

public class HW3 {
    public static void main(String[] args) {
        //task 3
        //How would you check if String is palindrome or not?

        String word = "Civic";//Natasha, Olololo - try different variants
        int length = word.length();
        System.out.println(length);
        String message;

        String word2 = "";
        for (int i=length-1; i>=0; i--){
            word2 += word.charAt(i);
        }
        System.out.println(word2);
        if(word.equalsIgnoreCase(word2)){
            message = "The word is a palindrome";
        }else{
            message = "The word is not a palindrome";
        }
        System.out.println(message);

    }
}
