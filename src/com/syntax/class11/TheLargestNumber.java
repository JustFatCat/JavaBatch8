package com.syntax.class11;

public class TheLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1000, 0, 20, 8, -1, 77, 56};
		
		int max = array[0];
		for(int i=1; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("The largest number is " + max);

	}

}
