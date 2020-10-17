package com.syntax.class02;

public class ArithemeticOperators {

	public static void main(String[] args) {
		// arithmetic Operators: +, -, *, /, %
		int num1, num2;
		
		num1 = 10;
		num2 = 12;
		
		System.out.println(num1 + num2);
		System.out.println(num2 - num1);
		
		double num3 = 10.99;
		double num4 = 2.99;
		
		double mult = num3*num4;
		System.out.println(mult);
		
		double div= num3/num4;
		System.out.println("The result of the devision of 2 double values = " + div);//3.6755852842809364
		
		float f1 = 10.99f;
		float f2 = 2.99f;
		
		System.out.println("The result of the division of 2 float values = " + f1/f2);//3.6755853
		
		
	}

}
