package com.syntax.class12;

public class ForVSEnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {10, 20, 30, 1};//num.length
		for(int i = num.length-1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
		// but for each loop goes only one direction, we cannot loop backward using enhanced for loop
		
		

	}

}
