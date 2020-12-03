package com.syntax.class15;

public class SubString {
    public static void main(String[] args) {
        String name = "Can you write second M";
        System.out.println(name.substring(4));//first 10 characters we be ignored
        System.out.println(name.substring(0));//redundant
        //System.out.println(name.substring(-1));//error

        System.out.println(name.substring(5,10));//we specified the range of characters, it will start from 5 and ends on 10 index
        System.out.println(name.substring(3,7) + " " +  name.substring(11,13));
    }

}
