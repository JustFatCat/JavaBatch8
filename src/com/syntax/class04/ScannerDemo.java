package com.syntax.class04;

import java.util.Scanner;

//shortcut to impopt Ctrl+shift+o

public class ScannerDemo {

	public static void main(String[] args) {
		int num = 80;
		String str = "I'm a string";
		
		Scanner scan = new Scanner(System.in);//enables input to the console
		//I'm adding some message to the user
		System.out.println("Please enter any text:");
		
		String value = scan.nextLine();//waits for your input and once you provided input --> hit Enter
		
		System.out.println("I captured String value = " + value);
		
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		System.out.println("Nice to meet you " + name);


	}

}
