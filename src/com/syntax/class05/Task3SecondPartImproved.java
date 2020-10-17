package com.syntax.class05;

import java.util.Scanner;

public class Task3SecondPartImproved {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your birth month");
		int month = input.nextInt();
		String season;
		
		if(month==12 || month==1 || month==2) {
			season = "Winter";
		} else if(month>=3 && month<=5) {
			season = "Spring";
		} else if(month>=6 && month<=8) {
			season = "Summer";
		} else if(month>=9 && month<=11) {
			season = "Autumn";
		} else {
			season = "Invalid";
		}
		
		System.out.println("You were born in " + season);


	}

}
