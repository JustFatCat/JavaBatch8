package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		// break - just break our loop

		for (int i = 1; i < 5; i++) {
			System.out.println("Hello");
			break;
		}

		// we want to print numbers from 1 to 10
		// when number is 5 we want to break the loop

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("End of the loop");
	

	}

}
