package com.syntax.class16;

public class HW3 {
    public static void main(String[] args){
            getGrade(50);
    }

    public static void getGrade(int score){
        char grade;
        if(score>=90){
            grade = 'A';
        }else if(score>=80 && score<90){
            grade = 'B';
        }else if(score>=70 && score<80){
            grade = 'C';
        }else if(score>=50 && score<70){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);
    }


}
