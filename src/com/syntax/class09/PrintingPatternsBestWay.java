package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {
		// second variant

		for (int r = 1; r <= 4; r++) {// outer loop controls rows
			for (int c = 0; c <= 6; c++) {// inner loop controls columns
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("---------------------------");

		for (int r = 1; r <= 6; r++) {
			for (int c = 1; c <= 12; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("--------------Square of the numbers");
		for (int i = 1; i <= 4; i++) {
			for (int c = 1; c <= 5; c++) {
				System.out.print(c);
			}
			System.out.println("");
		}

		System.out.println("--------------Another task------------------");
		for (int i = 1; i <= 4; i++) {// rows
			for (int y = 3; y <= 10; y++) {// columns
				System.out.print(y);
			}
			System.out.println();
		}

		System.out.println("---------------------------------------");
		for (int i = 7; i >= 1; i--) {
			for (int a = 1; a <= 6; a++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		System.out.println("---------------------------------------");
		for (int i = 1; i <= 5; i++) {//we don't care what is the value of i, as long as it gives 5 rows
			for (int a = 7; a >= 1; a--) {
				System.out.print(a);
			}
			System.out.println("");
		}


	}

}
