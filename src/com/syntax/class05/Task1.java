package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter amount of worked years");
		int years = input.nextInt();
		
		if(years>=5) {
			System.out.println("You can take your bonus");
			System.out.println("Please enter your annual salary");
			double salary = input.nextDouble();
			if(salary>50000) {
				System.out.println("Your bonus will be 5000");
			} else {
				System.out.println("Your bonus will be 3000");
			}
		} else {
			System.out.println("Please work longer in our company");
		}

	}

}
