package com.syntax.class11;

public class Task7Group {

	public static void main(String[] args) {
		// Task7
		int[][] array = { 
				{ 1, 2, 11, 14 }, 
				{ 18, 12, 3, 25 }, 
				{ 5, 8, 7, 19 } 
				};

		for (int i = 0; i < array.length; i++) {
			for (int a = 0; a < array[i].length; a++) {
				if (array[i][a] % 2 == 0) {
					System.out.println(array[i][a]);
				}
			}
		}

	}

}
