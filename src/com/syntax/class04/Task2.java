package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		boolean diploma = true;
		double gpaScore = 3.5;
		
		if(diploma) {
			if(gpaScore>=3.5) {
				System.out.println("You are eligeble for scholarship");
			} else {
				System.out.println("You should have studied harder");
			};
			
		}else {
			System.out.println("You should get a degree!");
		};
		
		System.out.println("------------------------------");
		
		double mortgageRate = 1.5 ;
		long mortgagePrice = 30000;
		
		if(mortgageRate > 4.5) {
			System.out.println("You will not buy a house");
		}else {
			System.out.println("You can consider buying");
			if(mortgagePrice>200000) {
				System.out.println("Please, take a loan!");
			}else {
				System.out.println("You can buy cash!");
			}
		};

	}

}
