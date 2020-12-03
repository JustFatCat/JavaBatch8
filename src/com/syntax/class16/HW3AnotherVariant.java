package com.syntax.class16;

public class HW3AnotherVariant {
    char getGrade(int marks){
        char grade;
        if(marks>=90 && marks<=100){
            grade = 'A';
        } else if(marks>=80 && marks<90){
            grade = 'B';
        } else if(marks>=70 && marks<80){
            grade = 'C';
        } else if(marks>=60 && marks<70){
            grade = 'D';
        } else{
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args){
        HW3AnotherVariant hw3 = new HW3AnotherVariant();
        hw3.getGrade(80);
        System.out.println("hw3.getGrade(80) is " + hw3.getGrade(80));
    }
}
