package com.syntax.class19;

public class HW3AnotherWay {
    private static String vowelsOnly(String name){
        return name.replaceAll("[^AEIOUaeiou]", "");
    }

    public static void main(String[] args) {
        System.out.println(vowelsOnly("All the vowels will be removed"));
    }

}
