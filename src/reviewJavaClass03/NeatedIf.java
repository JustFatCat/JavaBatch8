package reviewJavaClass03;

import java.util.Scanner;

public class NeatedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		double accountBalance = 1000;
		
		Scanner input = new Scanner(System.in);
		double transferAmount;
		System.out.println("Welcome to Syntax Bank. Please enter your password");
		password = input.nextLine();
		
		if("pass123".equals(password) || password.equals("pass123"))//just to show both variants
		
		{
			System.out.println("Please enter the amount that you want to transfer ");
			transferAmount = input.nextDouble();
			if(accountBalance < transferAmount) {
				System.out.println("Not enough funds");
			}else {
				System.out.println("Transfered successfully, remaining balance is " + (accountBalance-transferAmount));
			}
		}else {
			System.out.println("Wrong password, try again");
		}

	}

}
