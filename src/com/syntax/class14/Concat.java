package com.syntax.class14;

public class Concat {
    public static void main(String[] args) {
        String firstName = "Ebrar";
        String lastName = " Gur";
        String name = "Burju Kaya";
        String name2 = "Trop";
        System.out.println(firstName + lastName + name2);//this method is more preferable
        String completeName = firstName.concat(name2);
        System.out.println(completeName);
    }
}
