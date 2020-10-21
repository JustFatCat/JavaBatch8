package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// calculate sum of even and odd number from range 1 to 50
		int sum = 0;
		int sum1 = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				// System.out.println(i);
				sum += i;
				// System.out.println(sum);
			} else if (i % 2 == 1) {
				// System.out.println(i);
				sum1 += i;
				// System.out.println(sum);
			}
		}
		System.out.println("The sum of even numbers is " + sum);
		System.out.println("The sum of odd numbers is " + sum1);

		// I want to create a multiplication table
		// 1*1=1;
		// 1*2=2;
		// 1*3=3;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter number");
		
		int num1 = input.nextInt();
		int mult;

		for (int i = 1; i <= 10; i++) {
			mult = num1*i;
			System.out.println(num1 + " x " + i + " = " +mult);

		}

	}

}
