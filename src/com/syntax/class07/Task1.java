package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {

		boolean workDay = true;
		int day = 1;

		while (workDay) {
			System.out.println("I need a day off");
			day++;
			if (day == 6 || day == 7) {
				System.out.println("I do not need a day off any more");
				//workDay = false;
				break;
			}
		}

		System.out.println("------------Another variant---------------");
		boolean workDay1 = true;
		int day1 = 1;

		while (workDay1) {

			if (day1 < 6) {
				System.out.println("I need a day off");
			} else {
				System.out.println("It is weekend and I'm off");
				//workDay1 = false;
				break;
			}

			day1++;
		}

	}

}
