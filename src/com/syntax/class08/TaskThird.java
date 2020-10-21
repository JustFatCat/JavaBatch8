package com.syntax.class08;

import java.util.Scanner;

public class TaskThird {

	public static void main(String[] args) {
		// third
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the range of the numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int i;
		int sum1 = 0;
		int sum2 = 0;

		if (num1 <= num2) {
			for (i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
					sum1 += i;
				} else if (i % 2 != 0) {
					sum2 += i;
				}
			}
		} else if (num1 >= num2) {
			for (i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
					sum1 += i;
				} else if (i % 2 != 0) {
					sum2 += i;
				}
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);

	}

}
