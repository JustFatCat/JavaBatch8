package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		//first
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int quiz = input.nextInt();
		System.out.println("Please enter your mid term score");
		int midTerm = input.nextInt();
		System.out.println("Please enter your final score");
		int finalScore = input.nextInt();
		
		int avr = (quiz + midTerm + finalScore)/3;
		System.out.println(avr);
		
		if(avr>=90) {
			System.out.println("Grade A");
			System.out.println("You are a good student");
		} else if(avr>=70 && avr<90) {
			System.out.println("Grade B");
		} else if(avr>=50 && avr<70) {
			System.out.println("Grade C");
		} else if(avr>=40 && avr<40) {
			System.out.println("Grade D");
		} else {
			System.out.println("Grade F");
		}
		/*
		 * if your grade is A or B --> you are a good student, you are studying a lot
		 * 
		 * 
		 * 
		 */
		
		//second
		System.out.println("Please enter your birth month");
		int month = input.nextInt();
		
		if(month==12 || month==1 || month==2) {
			System.out.println("Winter");
		} else if(month>=3 && month<=5) {
			System.out.println("Spring");
		} else if(month>=6 && month<=8) {
			System.out.println("Summer");
		} else if(month>=9 && month<=11) {
			System.out.println("Autumn");
		}

	}

}
