package com.syntax.class15;

public class StringBuilderClass {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" world ");
        String string = "Hello";
        string.concat("World");
        System.out.println(stringBuilder);
        System.out.println(string);
    }
}
