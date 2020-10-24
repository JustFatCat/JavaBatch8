package com.syntax.class10;

public class ArrayTask2 {

	public static void main(String[] args) {
		// task 2
		
		// first variant to create an array
		String[] names = new String[5];
		names[0] = "Mike";
		names[1] = "Nicholas";
		names[2] = "Sofia";
		names[3] = "Cristina";
		names[4] = "Horse";
		
		System.out.println(names[2]);
		
		// second variant to create an array
		
		String[] names1 = {"Mike", "Nicholas", "Sofia", "Cristina", "Horse"};
		System.out.println(names1[2]);
		
		

	}

}
