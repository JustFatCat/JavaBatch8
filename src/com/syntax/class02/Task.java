package com.syntax.class02;

public class Task {

	public static void main(String[] args) {
		// 
		int num1 = 5;
		int num2 = 10;
		
		int sumNum = num1 + num2;
		System.out.println("The sum of 2 numbers " + num1 + " and " + num2 + " is equal to " + sumNum);
		
		int subrtactNum = num2 - num1;
		System.out.println("The subtraction of 2 numbers " + num2 + " and " + num1 + " is equal to " + subrtactNum );
        
		int multNum = num1 * num2;
		System.out.println("The multiplying of 2 numbers " + num1 + " and " + num2 + " is equal to " + multNum);
		
		int divNum = num2/num1;
		System.out.println("The devision of 2 numbers " + num2 + " and " + num1 + " is equal to " + divNum);
        
		//task2
		double num = 3.9;
		double squareNum = num * num;
		System.out.println("The square of the number 3.9 is " + squareNum );
		
		//task3
		
		int widht = 5;
		int height = 8;
		int rectangleArea = widht * height;
		
		int number1 = widht + widht;
		int number2 = height + height;
		
		int rectanglePer = number1 + number2;
		
		System.out.println("The perimeter of a rectangle with width " + widht + " and " + height + " is equal to " + rectanglePer + " and the area is " + rectangleArea);
		
	}

}
