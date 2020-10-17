package com.syntax.class05;

import java.util.Scanner;

public class Task3Emproved {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int quiz = input.nextInt();
		System.out.println("Please enter your mid term score");
		int midTerm = input.nextInt();
		System.out.println("Please enter your final score");
		int finalScore = input.nextInt();
		char grade;
		
		int avr = (quiz + midTerm + finalScore)/3;
		System.out.println(avr);
		
		if(avr>=90) {
			grade = 'A';
		} else if(avr>=70 && avr<90) {
			grade = 'B';
		} else if(avr>=50 && avr<70) {
			grade = 'C';
		} else if(avr>=40 && avr<40) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade is equal " + grade);
		
		if(grade=='A' || grade=='B') {
		System.out.println("You are a good student");
		}else {
			System.out.println("Please study more");
		}

	}

}
