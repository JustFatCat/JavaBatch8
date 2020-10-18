package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// ask user what is his name 5 times ---> print hello + name
		
		Scanner scan;
		String name;
		
		scan = new Scanner(System.in);
		
		int counter = 1;
		while(counter<=5) {
			System.out.println("Please, enter your name");
			name = scan.nextLine();
			System.out.println("Nice to meet you " + name);	
			System.out.println("------------------");	
			counter++;
		}
		
	
		
	}

}
