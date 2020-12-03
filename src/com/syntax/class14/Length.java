package com.syntax.class14;

public class Length {
    public static void main(String[] args) {
        String name = "Qasim";
        name.length();
        System.out.println(name.length());
        name = "";
        System.out.println(name.length());
        name = "Ahmed Qasim";
        System.out.println(name.length());
        name = "     Qasim     ";
        System.out.println(name.length());

        if(name.length()>10){
            System.out.println("You are great");
        }

    }
}
