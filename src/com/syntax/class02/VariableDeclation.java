package com.syntax.class02;

public class VariableDeclation {

	public static void main(String[] args) {
		//first way to create a variable:
		
		//create a variable = assigning value
		//declare a variable = initializing
		double $num = 12.99;
		
		//second way to create a variable:
		//declare a variable
		//initialize or assigning value
		
		int myBox;//we declare variable only once
		myBox = 135;//assigning the value
		
		System.out.println(myBox);//135
		
		myBox = 120;//reassigning the value
		
		System.out.println(myBox);//120
		
		//third way
		int num1, num2, num3;//if variable is of the same type, we can declare all in one line
		num1 = 10;
		num2 = 20;
		num3 = 30;
		
		System.out.println(num3);
		
		//what will be the output?
		
		char char1 = 'C';
		char char2 = 'd';
		
		char char3 = char1;
		System.out.println(char3);
		
		//Task:
		
		//whole numbers
		short number1 = 15;
		long number2 = 5454l;
		int number3 = 6565;
		byte number4 = 45;
		
		number1 = 34;
		number2 = 6766l;
		number3 = 999999;
		number4 = 67;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		
		//float
		
		float number5 = 55.9f;
		double number6 = 66.88;
		
		number5 = 66.99f;
		number6 = 888.99;
		
		System.out.println(number5);
		System.out.println(number6);
		
		//non numeric
		
		char charicter1 = 'C';
		boolean bool1 = true;
		
		char1 = 'B';
		bool1 = false;
		
		System.out.println(char1);
		System.out.println(bool1);
		

	}

}
