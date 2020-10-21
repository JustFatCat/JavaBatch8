package com.syntax.class09;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {// outer loop
			System.out.println("Hello");
			for (int y = 0; y < 3; y++) {// inner loop
				System.out.println("Bye");
			}
		}
		System.out.println("------------MORE EXAMPLES-----------------");

		for (int i = 10; i <= 10; i++) {
			// System.out.println(i);
			for (int j = 1; j <= 4; j++) {
				System.out.println("i = " + i + " j = " + j);
			}
			System.out.println("--------------");
		}

		System.out.println("-----------How can I print numbers from 10 to 99 using nested loops------------------");

		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.println(i + "" + j);
			}
		}
		System.out.println("-----------How can I print clock------------------");
		for (int h = 0; h <= 23; h++) {
			for (int min = 0; min < 60; min++) {
				if (min < 10 && h < 10) {
					System.out.println("0" + h + ":0" + min);
				} else if (h < 10) {
					System.out.println("0" + h + ":" + min);
				} else if (min < 10) {
					System.out.println(h + ":0" + min);
				}
			}
		}

		System.out.println("-----------How can I print car odometer------------------");

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int a = 0; a < 10; a++) {
					for (int b = 0; b < 10; b++) {
						for(int c = 0; c< 10; c++) {
							System.out.println(i + "" + j + "" + a + "" + b + "" + c);
						}
						
					}

				}
			}

		}

		for (int j = 0; j <10; j++) {
			System.out.println(j);
			for (int i = 0; i < 10; i++) {
				System.out.println(i);

			}
		}

	}

}
