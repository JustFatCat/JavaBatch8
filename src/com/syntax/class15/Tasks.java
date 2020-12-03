package com.syntax.class15;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //task 1
        String nameMom, nameDad, babyName, gender;
        Scanner input = new Scanner(System.in);
        System.out.println("What is mom name?");
        nameMom = input.nextLine();
        System.out.println("What is dad name?");
        nameDad = input.nextLine();
        System.out.println("Boy or girl?");
        gender = input.nextLine();

        if(gender.equals("girl")){
            babyName = ((nameMom.substring(0,nameMom.length()/2)) + (nameDad.substring(nameDad.length()/2)));
        } else if(gender.equals("boy")){
            babyName = ((nameDad.substring(0,nameDad.length()/2)) + (nameMom.substring(nameMom.length()/2)));
        }else{
            babyName = "No suggestions";
        }
        System.out.println(babyName);
    }
}
