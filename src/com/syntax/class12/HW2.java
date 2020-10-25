package com.syntax.class12;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		int num;
		boolean prime = true;
		String validate = "nothing";
		Scanner input = new Scanner(System.in);
		System.out.println("please input number");
		num = input.nextInt();

		while (prime) {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0 && num != i) {
					prime = false;
					validate = "is not prime";
					break;
				} else if (num == i) {
					prime = false;
					validate = "is prime";
					break;
				} else {
					prime = true;

				}

			}
		}
		System.out.println(num + ":" + validate);
	}

}
