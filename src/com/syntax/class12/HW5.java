package com.syntax.class12;

import java.util.Arrays;

public class HW5 {
//Write a program to find 2-d largest number
	public static void main(String[] args) {
		int[] num1 = { 1, 5, 20, 3, 6 };
		int length = num1.length;
		Arrays.sort(num1);// {1, 3, 5, 6, 20}
		System.out.println("Second highest number is " + num1[length - 2]);
		
//White the same with without sort

		int[] myArray = { 66, 45, 65, 965, 32, 876, 900 };
		int max = myArray[0];
		int secoundmax = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] > max) {
				secoundmax = max;
				max = myArray[i];
			} else if (myArray[i] > secoundmax && myArray[i]!=max) {
				secoundmax = myArray[i];

			}

		}

		System.out.println("the largest number in array is :" + max);
		System.out.println("the 2nd largest number is :" + secoundmax);

	}

}
