package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * 
		 * We are thinking of going shopping:
		 * first we check is store has sale:
		 * if no sale --> no shopping
		 * if sale --> we go for shopping
		 *         ask for the price:
		 *         
		 *         if price from 10 to 50 --> we give 10% discount
		 *         if price is between 50-100 --> 20% discount
		 *         if price is between 100-500 -->40% discount
		 *         if price is more than 500 --> 50% discount
		 *         
		 *         Your program should calculate final price that will be after 
		 *         discount 
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Does store have sale? true/false");
		boolean sale = input.nextBoolean();
		double discount;
		
		if(sale) {
			System.out.println("What is the price?");
			double price = input.nextDouble();
			if(price >=10 && price<50) {
				discount = price * 0.1; 
				System.out.println("We will give you 10 % discount");
			}else if(price>=50 && price<100) {
				discount = price * 0.2; 
				System.out.println("We will give you 20 % discount");
			}else if(price>=100 && price<500){
				discount = price * 0.4;
				System.out.println("We will give you 40 % discount");
			}else if(price>=500){
				discount = price * 0.5;
				System.out.println("We will give you 50 % discount");
			}else {
				discount = 0;
			}
			
			double finalPrice = price - discount;
			System.out.println("Your price will be " + finalPrice);
		}else {
			System.out.println("Sorry, no shopping");
		}
		
		

	}

}
