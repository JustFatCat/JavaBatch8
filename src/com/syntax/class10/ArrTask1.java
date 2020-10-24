package com.syntax.class10;

public class ArrTask1 {

	public static void main(String[] args) {
		// task about cars
		String[] cars = { "Laga", "Toyota", "Mers", "Tesla", "Reno", "Cetroen" };

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);

		}
		System.out.println("-------------------------------");
		

		// sum of integers

		int[] array = { 10, 5, 15 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);

	}

}
