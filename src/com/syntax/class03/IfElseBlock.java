package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		double money = 20;
		double iceCream = 5.59;

		if (money >= iceCream) {
			System.out.println("I'm buying ice cream");
			System.out.println("I would like vanilla flavour");
		} else {
			System.out.println("Sorry, no ice cream");
			System.out.println("Do not worry!");

		};
		System.out.println("I'm code that executes without any condition");
		
		boolean sleepy = true;
		
		if(sleepy) {
			System.out.println("I'll take a nap");
		}else {
			System.out.println("I'll study some Java");
		};
		
		boolean hungry = false;
		
		if(hungry) {
			System.out.println("I'll go eat");
		}else {
			System.out.println("I'll continue studying");
		}

	}

}
