package com.syntax.class10;

public class ArraysIntro {

	public static void main(String[] args) {
		// I have 5 students in the class and I need to calculate the average score;
		
		int[] grades = new int[5];
		grades[0] = 98;
		grades[1] = 80;
		grades[2] = 89;
		grades[3] = 77;
		grades[4] = 86;
		
		int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4])/5;
		System.out.println("Average score of my students = " + average);
		
		double[] array;
		array = new double[3];
		array[0] = 12.99;
		array[1] = 10.89;
		
		System.out.println("The value of last element " + array[2]);
		
		array[2] = 5.15;
		
		System.out.println("So, now the value of last element " + array[2]);
		
		//array[3]=7; ArrayIndexOutOfBoundsException, Index 3 out of bounds for length 3
		//System.out.println("So, now the value of last element " + array[3]);
		
		System.out.println("-----------------------------------------");
		
		String[] liquid = new String[4];//arrays are fixed in size
		liquid[2]="Water";
		liquid[1]="Tea";
		
		System.out.println(liquid[0]);
		

	}

}
