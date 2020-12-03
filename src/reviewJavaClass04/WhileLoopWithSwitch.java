package reviewJavaClass04;

import java.util.Scanner;

public class WhileLoopWithSwitch {

	public static void main(String[] args) {
		double num1, num2, result;
		char operation;

		while(true) {
		System.out.println("Please enter two numbers");
		Scanner input = new Scanner(System.in);
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		
		System.out.println("Please enter the operation +-/*");
		operation = input.next().charAt(0);

		if(!(operation=='+' || operation=='-' || operation=='/'|| operation=='*')){
			System.out.println("Operation not supported");
			continue;
		}

		switch(operation) {
		case '+': 
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		default:
			result = 0;
		}
		System.out.println(result);
		System.out.println("Enter Yes to perform more operations and No");
		if("No".equals(input.next())) {
			break;
		}
		
		}
		
		

	}

}
