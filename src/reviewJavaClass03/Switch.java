package reviewJavaClass03;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		char operation;
		int results = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println("Enter the operator(+,-,*,/)");
		operation = input.next().charAt(0);// we want to use just the first character of the string

		/*
		 * if (operation == '+') { results = num1 + num2; } else if(operation=='-') {
		 * results = num1 - num2; } else if(operation == '*') { results = num1 - num2;
		 * }else if(operation == '/' ) { results = num1/num2; }else {
		 * System.out.println("Invalid operation"); } System.out.println(results);
		 */
		
		switch(operation) {
		case '+':
			results = num1 + num2;
			break;
		case '-':
			results = num1 - num2;
			break;
		case '*':
			results = num1 * num2;
			break;
		case '/':
			results = num1 / num2;
			break;
		default:
			System.out.println("Invalid operation");
		}
		System.out.println(results);
		
		double marks = 100;
		if(marks>90 && marks<=100) {
			System.out.println('A');
		}
		
		String name = null;
		int number = 10;
		if(number==10) {
			name = "Mariia";
		}else {
			
		}
		System.out.println(name);
		
		int day = 7;

		switch(day) {
		case 1:
		System.out.println("Monday");
		case 2:
		System.out.println("Tuesday");
		case 3:
		System.out.println("Wednesday");
		case 4:
		System.out.println("Thursday");
		case 5:
		System.out.println("Friday");
		}

	}

}
