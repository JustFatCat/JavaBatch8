package com.syntax.class12;

public class HW4 {

	public static void main(String[] args) {
		//
		int[] myArray = { 66, 45, 65, 32, 876, 900 };
		int max = myArray[0];
		int min = myArray[0];
		
		for (int i = 1; i < myArray.length; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
			}
			if (myArray[i] < min) {
				min = myArray[i];
			}
		}
		System.out.println("the largest number in array is :" + max);
		System.out.println("the smallest number in array is :" + min);

	}

}
