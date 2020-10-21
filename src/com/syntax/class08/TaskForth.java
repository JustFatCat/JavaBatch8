package com.syntax.class08;

import java.util.Scanner;

public class TaskForth {

	public static void main(String[] args) {
		// forth
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name of the item you want to buy");
		String name = input.nextLine();

		System.out.println("Please enter the price you want to pay");
		int usersPrice = input.nextInt();

		int realPrice = 150;
		int change = 0;

		while (usersPrice != realPrice) {
			if (usersPrice < realPrice) {
				System.out.println("You need to pay more, try again");
				System.out.println("Please enter the price you want to pay");
				usersPrice = input.nextInt();
			} else if (usersPrice > realPrice) {
				change = usersPrice - realPrice;
				System.out.println("Here is your change " + change + ". Have a good day!");
				break;
			}
		}
		if (usersPrice == realPrice) {
			System.out.println("You paid enough!");
		}
	}
}
