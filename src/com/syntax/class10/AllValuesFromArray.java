package com.syntax.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		// 
		
		String[] cars = { "Laga", "Toyota", "Mers", "Tesla", "Reno", "Cetroen" };

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);

		}
		
		System.out.println("--------Getting values from array enhansed for loop------");
		/*
		 * for(:name of the array)
		 * 
		 */
		
		for(String car:cars) {
			System.out.print(car + " ");
		}
		System.out.println("");
		System.out.println("--------Getting values from array enhansed for loop------");
		
		int[] numbers = {10, 100, 90, 600, 89};
		for(int num:numbers) {
			System.out.println(num);
		}
		
		System.out.println("--------Getting values from array enhansed for loop------");
		boolean[] arrayOfBoolean = {true, false, true, false};
		for(boolean bool:arrayOfBoolean) {
			System.out.println(bool);
		}
		
		
	}



}
