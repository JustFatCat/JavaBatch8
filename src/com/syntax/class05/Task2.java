package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//subtask 1
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int height = input.nextInt();
		
		if(height<60) {
			System.out.println("You are short");
		} else if(height>60 && height<72) {
			System.out.println("You are medium");
		} else if(height>72) {
			System.out.println("You are tall");
		}
		
		//subtask 2
		
		System.out.println("Please enter the day of the week");
		int day = input.nextInt();
		
		if(day>=1 && day<=5) {
			System.out.println("It's week day");
		}else if(day==6 || day==7) {
			System.out.println("It's weekend");
		}else {
			System.out.println("Invalid day");
		}

	}

}
