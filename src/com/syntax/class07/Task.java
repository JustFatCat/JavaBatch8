package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		String timeOfDay = "Morning";
		String day = "Saturday";

		switch (timeOfDay) {
		case "Morning":
			System.out.println("Good morning");

			switch (day) {
			case "Monday":
				System.out.println("Collegue");
				break;
			case "Thursday":
				System.out.println("Collegue");
				break;
			case "Saturday":
				System.out.println("Collegue");
				break;
			}

			/*
			 * if(day.equals("Saturday")) { System.out.println("Class"); }else
			 * if(day.equals("Monday")) { System.out.println("Colleague"); }
			 */
			break;
		case "Noon":
			System.out.println("Good afternoon");
			break;
		case "Evening":
			System.out.println("Good Evening");
			break;
		case "Night":
			System.out.println("Good Night");
			break;
		default:
			System.out.println("N/A");
		}

	}

}
