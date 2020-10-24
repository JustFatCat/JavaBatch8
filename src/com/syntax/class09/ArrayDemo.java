package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a = 10;
		a = 20;
		
		//int student1 = 90;
		//int student2 = 97;
		//int student3 = 89;
		//int student4 = 100;
		//int student5 = 98;
		
		int [] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		//to access element from the array?
		System.out.println("Accessing the 3 element " + num[2]);
		
		System.out.println(num[1]+num[4]);
		
		//I would like to change 50 to 100
		
		num[4] = 100;
		System.out.println("Value of the 5th element after changing " + num[4]);
		
		int[] array = new int[2];
		//array[0] = 10.99; CE: type of value must be integer
		
		String[] array1 = new String[4];
		array1[0] = "Hello";
		
		double[] array3 = new double[5];
		array[2] = 100;//compiler allows us to place small value in the bigger box
		
		
		
		
		
		
		

	}

}
