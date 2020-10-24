package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		// 
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		char secondValue = grades[1];
		
		String[] names = { "Mike", "Burju", "Jack", "Natasha", "Bryan" };
		String secondVar = names[1];
		
		//get all values from grade array
		for(int i=0; i<grades.length; i++) {
			char valueFromArray = grades[i];
			System.out.println(valueFromArray);
		}

	}

}
