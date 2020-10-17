package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter boolean value for rain");
		
		boolean rain= scan1.nextBoolean();//I'm waiting for your input
		
		if(rain) {
			System.out.println("Please take an umbrella");
		}else {
			System.out.println("It's weather go for a walk");
		};
		
		System.out.println("---------------------------");
		
		System.out.println("Please enter your name");
		String name = scan1.next();
		
		System.out.println("Please enter your age");
		int age = scan1.nextInt();
		
		System.out.println("Your name is " + name + ". Your age is " + age);
		

	}

}
