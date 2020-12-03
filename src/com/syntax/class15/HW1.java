package com.syntax.class15;

public class HW1 {
    public static void main(String[] args) {
        //task 1
        //How would you reverse a String character by character?

        String name = "Nicholas";
        int length = name.length();
        for(int i=length-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
        System.out.println("");
        System.out.println("---------------------");

        StringBuilder stringBuilder = new StringBuilder("Anna");//another variant
        System.out.println(stringBuilder.reverse());


    }
}
