package reviewJavaClass01;

public class Recap {
	public static void main(String[] args) {
		System.out.println("Hi everyone");
		int number1 = 10;
		int number2 = 20;
		int result = number1 * number2;
		System.out.println(result);
		
		String stringNumber1 = "10";
		String stringNumber2 = "20";
		System.out.println(stringNumber1 + stringNumber2);
		
		String name = "syntax";
		
		//number of data types in Java 
		//Primitive data types: 
		
		/*
		 * Numeric data types  
		 * We have 6 numeric data types(for whole numbers): byte, short, int, long
		 * And float, double for numbers with decimal point  
		 * 
		 */
		
		float floatNumber = 102.098090909089898f;
		System.out.println(floatNumber);
		
		double doubleNumber = 102.098090909089898f;
		System.out.println(doubleNumber);
		
		/* 
		 * Non-numeric data types: char, boolean
		 */
		
		char charVar = 'C';
		System.out.println(charVar);
		boolean boolVar = true;
		System.out.println(boolVar);
		
		System.out.println("-----------------------------");
		System.out.println(10 + 20);
		
		double bonus = 0.08 ;
		int employee1Salary = 1020000; 
		int employee2Salary = 1300000; 
		int employee3Salary = 1400000; 
		int employee4Salary = 1500000;  
		
		double bonusForEmployee1 = employee1Salary * bonus;
		double bonusForEmployee2 = employee2Salary * bonus;
		double bonusForEmployee3 = employee3Salary * bonus;
		double bonusForEmployee4 = employee4Salary * bonus;
		
		System.out.println(bonusForEmployee1);
		System.out.println(bonusForEmployee2);
		System.out.println(bonusForEmployee3);
		System.out.println(bonusForEmployee4);
		
		double pi = 3.1478685777575;
		
		System.out.println("----------------------------");
		
		String firstName = "Mooneer"; 
		String surName = "Fazly";
		String mobileOrEmail = "mooneerfalzy@gmail.com";
		String password = "password";
		int dayOfBirth = 1;
		int monthOfBirth = 1;
		int year = 1995;
		char gender = 'M';
		char gender1 = 'F'; 
		  
	}

}
