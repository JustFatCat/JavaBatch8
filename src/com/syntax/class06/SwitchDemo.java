package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * Let's ask a tester on witch browser they would like to use
		 * 
		 */
		Scanner input;
		String browser;
		String message;
		
		input = new Scanner(System.in);
		System.out.println("Please enter the browser");
		browser = input.nextLine();
		
		switch(browser.toUpperCase()) {
		case "Safari":
			message = "Your code will be executed in Safary";
			break;
		case "Chrome":
			message = "Your code will be executed in Chrome";
			break;
		case "Firefox":
			message = "Your code will be executed in Firefox";
			break;
		default:
			message = "Entered browser is not suported";
			break;
		
		}
		System.out.println(message);
		
		//switch cannot work with double, float, long, boolean
		//switch cannot use relational or logical operators
		
		float f = 10.99f;
		double d = 2323.999;
		long l= 454545555555555l;
		boolean b = true;
		
		/*switch(l) { CE: - Cannot switch on a value of type long. Only convertible int values, strings or enum variables are permitted
	- Cannot switch on a value of type double. Only convertible int values, strings or enum variables are 
	 permitted
		
		}*/
	}

}
