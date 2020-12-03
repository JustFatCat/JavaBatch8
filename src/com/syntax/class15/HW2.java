package com.syntax.class15;

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        //task 2
        //How would you reverse a String word by word?

        String sent = "Hello how are you doing?";
        String[] array = sent.split("[\\s+]");
        int length = array.length;
        System.out.println(length);

        for(int i=length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }

        System.out.println("-------------------------");
        String sentence = "What did u use the most";

        String[] stringArray = sentence.split(" ");
        System.out.println(Arrays.toString(stringArray));

        for (int i=0; i<stringArray.length; i++){
            StringBuilder stringBuilder = new StringBuilder(stringArray[i]);
            System.out.println(stringBuilder);
            stringArray[i] = stringBuilder.reverse().toString();
        }
        System.out.println(Arrays.toString(stringArray));




    }
}
