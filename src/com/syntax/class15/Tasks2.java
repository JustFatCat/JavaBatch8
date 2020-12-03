package com.syntax.class15;

public class Tasks2 {
    public static void main(String[] args) {
        //task 2
        String str = "Hello";
        int length = str.length();
        if(!str.isEmpty()){
            if(length%2 != 0 && length>=3){
                int center = length/2;
                System.out.println(str.charAt(center));
            }
        }

        //task 3
        String name = "Sunday";
        System.out.print(name.charAt(5));
        System.out.print(name.charAt(4));
        System.out.print(name.charAt(3));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(0));

    }
}
