package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your country:");
		String country = input.nextLine();
		String message;
		
		switch(country) {
		case "China":
			message = "Chinese";
			break;
		case "Russia":
			message = "Russian";
			break;
		case "USA":
			message = "English";
			break;
		default:
			message = "Invalid country";
		}
		System.out.println(message);

	}

}
