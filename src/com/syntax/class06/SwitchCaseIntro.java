package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number of a day");
		int day = scan.nextInt();
		
		if (day == 1) {
			System.out.println("Today is Monday we have no class");
		} else if (day == 2) {
			System.out.println("Today is Tuesday we have manual class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday my dudes!");
		} else if (day == 4) {
			System.out.println("Today is Thursday and we have Review class");
		} else if (day == 5) {
			System.out.println("Today is Friday, I miss Java classes");
		} else if (day == 6) {
			System.out.println("Today is Saturday, I did a lot of coding");
		} else if (day == 7) {
			System.out.println("Today is Saturday, I did a lot of coding");
		} else {
			System.out.println("This is a wrong day");
		}
		
		System.out.println("---Same example using switch case----");
		String today;
		
		switch (day) {//data type of variable must match with datatype of cases
		
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednesday";
			break;
		case 4:
			today="Trursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
		default:
			today="Invalid day";
			//break; --> optional since it is a last statement in switch block
		
		}
	

	}

}
