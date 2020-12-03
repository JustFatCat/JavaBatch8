package com.syntax.class29;

import java.util.Arrays;

public class Collection {
    public static void main(String[] args) {
        String name = "Ali";
        String name1 = "Nabin";
        String name2 = "Sofia";
        //variables can hold one value at time
        //if we need to store 1000 values, we should declare 1000 variables
        int initialSize = 3;
        int elementStored = 0;

        String[] names = new String[3];
        names[0] = "Ali";
        elementStored++;
        names[1] = "Nabin";
        elementStored++;
        names[2] = "Sofia";
        elementStored++;
        if(names.length>=elementStored){
            names = expandArr(names);
        }
        //names[3] = "Davit"; Array index out of bounds as the size of the array was 3
        //we can not store more than 3 elements

        //Arrays are fixed in size, we have to provide the size of the array in advance before we can use it
        System.out.println(Arrays.toString(names));

        if(names.length>=initialSize){
            String[] temp = new String[initialSize*2];
            temp[0] = names[0];
            temp[1] = names[1];
            temp[2] = names[2];
            temp[3] = names[3];

        }

    }
    public static String[] expandArr(String[] oldArr){
            String[] newArr = new String[oldArr.length*2];
            for(int i=0;i<oldArr.length;i++){
                newArr[i] = oldArr[i];
            }

            return newArr;

    }
}
