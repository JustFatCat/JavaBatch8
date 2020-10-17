package reviewJavaClass02;

import java.util.Scanner;

public class Assignment34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		// first way

		/*
		 * if (num1 >= num2) { if (num1 > num3) {
		 * System.out.println("The largest number is " + num1); } else if (num1 >= num3)
		 * { } } else if (num3 >= num2) { System.out.println("The largest number is " +
		 * num3); } else if (num2 >= num3) { System.out.println("The largest number is "
		 * + num2);
		 * 
		 * }
		 */

		// second way
		if (num1 > num2) {
			System.out.println("Inside num1>num2 value of num1 " + num1 + " num2 " + num2);
		} else {
			num1 = num2;
			System.out.println("Inside the else block " + num1 + " num2 " + num2);
		}

		if (num1 > num3) {
			System.out.println("The largest number is " + num1);
		} else {
			System.out.println("The largest number is " + num3);
		}

	}

}
