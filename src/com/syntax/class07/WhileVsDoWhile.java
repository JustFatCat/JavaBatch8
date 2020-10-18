package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		System.out.println("------------While loop----------");
		int a = 20;
		//first we check the condition
		while(a<15) {
			System.out.println("Hello");//do something
			a++;
		}
		System.out.println("------------Do While loop----------");
		int b = 20;
		//first do something 
		do {
			System.out.println("Hi");
			b++;
		} while(b<15);//then check the condition
		
		
		

	}

}
