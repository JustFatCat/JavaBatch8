package com.syntax.class06;

import java.util.Scanner;

public class Caculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		System.out.println("Enter operator(+,-,/,*)");
		char operator = input.next().charAt(0);
		
		double result = 0;
		
		switch(operator) {
		
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		default:
			 System.out.println ("Try again");
		}
		System.out.println("Your result is " + result);
	
	}

}
