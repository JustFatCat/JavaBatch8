package com.syntax.class15;

public class HW4 {
    public static void main(String[] args) {
        //task 4
        //How would you swap 2 strings without a temporary variable?

        String str1, str2;
        str1 = "Cat";
        str2 = "Dog";
        System.out.println("The initial value of str1: " + str1);
        System.out.println("The initial value of str1: " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("The final value of str1: " + str1);
        System.out.println("The final value of str2: " + str2);
    }
}
