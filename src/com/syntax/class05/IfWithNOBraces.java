package com.syntax.class05;

public class IfWithNOBraces {

	public static void main(String[] args) {
		boolean isSaturday = false;

		if (isSaturday)
			System.out.println("Today is a Java class");//if no braces only 1 line will be treated as code for it block
			System.out.println("Today is Saturday");//this code is not belong to the if statement(because no braces)


	}

}