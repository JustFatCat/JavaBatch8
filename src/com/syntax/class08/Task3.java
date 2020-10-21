package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// first
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

		// second
		System.out.println("-------------------------------------");
		Scanner input = new Scanner(System.in);
		System.out.println("Did you apply a credit card?(yes/no)");

		String answer = input.nextLine();

		while (answer.equalsIgnoreCase("no")) {
			System.out.println("Did you apply a credit card?(yes/no)");
			answer = input.nextLine();
		}
		System.out.println("Good day");

		/*
		 * do { System.out.println("Did you apply a credit card?(yes/no)"); answer =
		 * input.nextLine();
		 * 
		 * } while (answer.equalsIgnoreCase("no")); System.out.println("Good day!");
		 */

	}

}
