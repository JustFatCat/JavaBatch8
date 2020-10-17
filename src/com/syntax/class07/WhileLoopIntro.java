package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// int time = 15;

		/*
		 * while (time>12) { System.out.println("Good day");//Infinite loop }
		 */

		/*
		 * while (time>12) { System.out.println("Good day");//3 times
		 * time--;//decreasing the value }
		 */

		/*
		 * while (time>12) { System.out.println("Good day");//Infinite loop
		 * time++;//increasing the value }
		 */

		// I want to print numbers from 1 to 50
		System.out.println("-----------Printing Numbers 1 to 50---------");
		int num = 1;

		while (num <= 50) {
			System.out.println(num);
			num++;
		}

		// I want to print numbers from 10 to 60
		System.out.println("-----------Printing Numbers 10 to 60---------");
		int a = 10;

		while (a <= 60) {
			System.out.println(a);
			a++;
		}

		// I want to print numbers from 100 to 60
		System.out.println("-----------Printing Numbers 100 to 60---------");
		int b = 100;

		while (b >= 60) {
			System.out.println(b);
			b--;
		}

		// I want to print numbers from 10 to 30
		System.out.println("-----------Printing Numbers 10 to 30, but only even numbers---------");
		int c = 10;

		while (c <= 30) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
			c++;
		}

		System.out.println("-------------Another way------------");
		int d = 10;

		while (d <= 30) {
			System.out.println(d);
			d += 2;
		}

		System.out.println("-----------And another way---------");
		int e = 10;

		while (e <= 30) {
			if (e % 2 == 0) {
				System.out.println(e);
				// e++ --> if we keep increment here --> we will get infinite loop
			}
			e++;

		}
		System.out.println("End of the code");

		// print numbers from 100 to 1(odd numbers only)
		System.out.println("-------New task");
		int number = 100;

		while (number <= 100 && number >= 1) {

			if (!(number % 2 == 0)) {
				System.out.println(number);
			}
			number--;
		}
		System.out.println("------------Another variant");

		int g = 99;

		while (g > 0) {
			System.out.println(g);
			g -= 2;
		}

	}

}
