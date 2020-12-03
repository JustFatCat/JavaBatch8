package com.syntax.class16;

public class HW1 {
    //Create a method createEmail(). Based on values of users name,
    // lastName and email type, your method should return complete email Address.
    public  static void main(String[] args){
        createEmail("cat", "apple", "@", "gmail.com"  );
    }

    public static void createEmail(String name, String lastName, String atSign, String mail){
        System.out.println(name + lastName + atSign + mail);
    }
}
