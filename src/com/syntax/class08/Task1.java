package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {
		// first
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		// second
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		// third (1 variant)
		for (int i = 20; i >= 1; i -= 2) {
			System.out.println(i);
		}
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		// third (2 variant)
		for (int i = 20; i > 0; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// forth
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		for (int a = 50; a > 20; a--) {
			if (a % 2 == 1)
				System.out.print(a + " ");
		}
		
		System.out.println("-----------What will be the output");
		int sum = 0;
		
		for(int i=1; i<6; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		int c;
		
		for(c=1; c<6; c++) {
			System.out.println("Value of c inside of for loop " + c);
		}
		System.out.println("Value of c outside of for loop " + c);
		
		System.out.println("-----------What will be the output");
		
		int result = 1;
		
		for(int i=10; i>=1; i-=2) {
			result*=i;
			System.out.println("Result =" + result);
		}
		

	}
}
