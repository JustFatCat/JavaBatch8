package com.syntax.class10;

public class ArrayTask3 {

	public static void main(String[] args) {
		// task 3
		
		// first variant to create an array
		String[] words = new String[5];
		words[0] = "Java";
		words[1] = "Saturday";
		words[2] = "day";
		words[3] = "coding";
		words[4] = "is";
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
		
		// second variant to create an array
		String[] words1 = {"Java", "Saturday", "day", "coding", "is"}; 
		System.out.println(words1[1] + " " + words1[4] + " " + words1[0] + " " + words1[3] + " " + words1[2]);

	}

}
