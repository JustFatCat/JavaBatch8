package com.syntax.class10;

public class ArrayTask1 {

	public static void main(String[] args) {
		// task 1

		// first variant to create an array
		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';

		System.out.println(grades[1]);

		// second variant to create an array
		char[] grades1 = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[1]);
		

	}

}
