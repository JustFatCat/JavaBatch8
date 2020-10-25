package com.syntax.class11;

public class Task2Group {

	public static void main(String[] args) {
		int num = 31;
		int i = 2;
		boolean ifPrime = false;

		while (i < num) {
			if (num % i == 0) {
				ifPrime = false;
				break;
			} else {
				ifPrime = true;
			}
			i++;
		}

		if (ifPrime == true) {
			System.out.println("The number " + num + " is a prime number");
		} else {
			System.out.println("The number " + num + " is not prime number");
		}

	}
}
