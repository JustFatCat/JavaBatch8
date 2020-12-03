package com.syntax.class18;

public class HW2 {
    /*Create a method that will take a String as a parameter
    and returns reversed String. Method should be available
    to all classes within your project and accessible by class name.*/

    public static void reverseString(String str){
        int length = str.length();
        String reversedStr = "";
        for(int i=length-1; i>=0; i--){
            reversedStr = reversedStr + str.charAt(i);
        }
        System.out.println(reversedStr);





    }

}
