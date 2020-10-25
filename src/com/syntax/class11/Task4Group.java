package com.syntax.class11;

public class Task4Group {

	public static void main(String[] args) {
		// max and min number in the array

		int[] array = { 5, 13, 16, 78, -10, 167 };

		int max = array[0];// max number;

		for (int i = 1; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(" The max number is " + max);

		// min number;
		int min = array[0];
		for (int i = 1; i < array.length; i++) {

			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(" The min number is " + min);
	}

}
