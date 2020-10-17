package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {
		// I would like to say: My name is Olga
		String name = "Olga";
		System.out.println("My name is " + name);
		
		String lastName = "Sorells";
		
		//I would like to print Olga Sorells
		
		System.out.println(name + " " + lastName);
		
		String city = "Miami";
		//Olga lives in Miami
		System.out.println(name + " lives in " + city);
		
		char grade = 'B';
		//Olga is B student
		System.out.println(name + " is " + grade + " student");
		
		int age = 21;
		//Olga is 21 years old
		System.out.println(name + " is " + age + " years old");
		
		/*to attach/concatenate ANY value (char, int, String, double)
		to a String we use + (String concatenation operator)
		*/
		
		int date = 27;
		String month = "September";
		System.out.println("Today is " + date + " " + month);
		
		String state = "DC";
		String anotherState = "DC ";
		//above Strings are not equal, state has 2 characters and anotherState has 3 characters
	    System.out.println(state);
		System.out.println(anotherState);	
		
		

	}

}
