package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {
		//task 1
		
		int month = 5;
		
		if(month==1) {
			System.out.println("The month is January");
		} else if(month==2) {
			System.out.println("The month is February");
		} else if(month==3) {
			System.out.println("The month is March");
		} else if(month==4) {
			System.out.println("The month is April");
		} else if(month==5) {
			System.out.println("The month is May");
		} else if(month==6) {
			System.out.println("The month is June");
		} else if(month==7) {
			System.out.println("The month is July");
		} else if(month==8) {
			System.out.println("The month is August");
		} else if(month==9) {
			System.out.println("The month is September");
		} else if(month==10) {
			System.out.println("The month is October");
		} else if(month==11) {
			System.out.println("The month is November");
		} else if(month==12) {
			System.out.println("The month is December");
		} else {
			System.out.println("It's not right number, try again from 1 till 12");
		};
		
		System.out.println("--------------------------------");
		
		//task 2
		
		int number= 33;
		
		if(number > 0) {
			System.out.println("This number " + number + " is positive");
		} else if( number < 0) {
			System.out.println("This number " + number + " is negative");
		} else {
			System.out.println("It's zero!");
		};
		
		System.out.println("-------------------------");
		
		//task 3
		
		int number1 = 67;
		int number2 = 2;
		double result = number1%number2;
		
		if(result==0) {
			System.out.println("This number " + number1 + " is even");
		} else {
			System.out.println("This number " + number1 + " is odd");
		};
	}
}
	
