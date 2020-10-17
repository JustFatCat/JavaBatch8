package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please print three distinct double values");
		double num1,num2,num3,max;
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		input.close();//what is that?
		
		//1st way
		
		System.out.println("\"------------Placing comparison in IF part\"-------------\"");
		if(!(num1==num2 && num2==num3)) {
			if(num1>num2 && num1>num3) {
				max = num1;
			}else if(num2>num3) {
				max = num2;
			}else {
				max = num3;
			}
			System.out.println(max);
		}else {
			System.out.println("Numbers are equal");
		}
		
		System.out.println("\"------------Placing comparison in ELSE part\"-------------\"");
		if(num1==num2 && num2==num3) {
			System.out.println("Numbers are equal");	
		}else {
			if(num1>num2 && num1>num3) {
				max = num1;
			}else if(num2>num3) {
				max = num2;
			}else {
				max = num3;
			}
			System.out.println(max);
		}

		System.out.println("------Comparing 2 numbers using Nested if");
		//2nd way
		
		double biggest;
		if(num1>num2 ) {//if number 1 larger than number 2
			if(num1>num3) {
				biggest =(int)num1;
			}else {
				biggest =(int)num2;
			}
		}else {//number 2 is larger than number 1
			if(num2>num3) {
				biggest = num2;
			}else {
				biggest = num3;
			}
		}
		System.out.println("The largest number is " + biggest);

	}

}
