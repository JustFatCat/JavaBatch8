package com.syntax.class06;

import java.util.Scanner;

public class TaskSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char grade = input.next().charAt(0);
		System.out.println("Please enter your grade");
		String message;
		
		switch(grade) {
		case 'A':
			message = "Excelent";
			break;
		case 'B':
			message = "Good";
			break;
		case 'C':
			message = "Average";
			break;
		case 'D':
			message = "Bad";
			break;
		default:
			message = "Not Acceptable";
		}
		System.out.println("Your grade is " + grade + ". " + message);
	

	}

}
