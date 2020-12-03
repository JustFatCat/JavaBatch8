package com.syntax.class18;

public class HW3 {
    /*Create a method that will accept a String as a
    parameter and return a new String that consist only of vowels. Method should be
    available inside the class only where it was declared and executed by calling it is name.*/

    private static void onlyVowels(String str1){
        String newStr1 = str1.replaceAll("[^aeiouAEIOU]", "");
        System.out.println(newStr1);
    }

    public static void main(String[] args) {
        String str1 = "Hello my friend";
        HW3.onlyVowels(str1);
    }

}
