package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		String day = "Sunday";
		
		if(day.equals("Saturday") && day.equals("Sunday")) {
			System.out.println("Today I have Java class");
		}
		System.out.println("The end");
		
		System.out.println("________________more examples_______");
		
		/*
		 * if day is 1 or 5 --> I am off from Syntax
		 * if day is 2 or 3 --> GIT classes
		 * if day is 4 --> Review
		 * if day 6 or 7 -->Java classes
		 * Everything else will be invalid day
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter todays day using number only");
		
		int today = scan.nextInt();
		
		if(today==1 || today==5) {
			System.out.println("I am off from Syntax");
		}else if(today==2 || today==3 ) {
			System.out.println("GIT classes");
		}else if(today==4) {
			System.out.println("Review");
		}else if(today==6 || today==7) {
			System.out.println("Java classes");
		} else {
			System.out.println("It's indalid value, try again");
		}
		

	}

}
