package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// Task about Credit Card, do user have credit card or not (Nested if)

		Scanner input = new Scanner(System.in);
		String answer;
		double balance;

		System.out.println("Please enter if you have a credit card (true/false)");
		answer = input.next();

		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("What is your balance on a card?");
			balance = input.nextInt();
			if (balance > 1000) {
				System.out.println("Please pay off your card balance");
			} else {
				System.out.println("You can spend more");
			}
		} else {
			System.out.println("Would you like to get a credit card?");

		}

	}

}
