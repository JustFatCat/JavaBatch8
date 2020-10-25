package com.syntax.class11;

public class Creating2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create 2D array of food
		//american
		//italian
		//asian
		//afghani
		//idian
		
		String[][] food = {
				{"steak", "hot dog", "cheese burger"},
				{"pizza", "pasta", "tiramisy"},
				{"sushi", "ramen", "fried rice", "dumplings"},
				{"kebab", "manto"},
				{"beriani", "masala", "curry", "chicken"}
		};
		for(String[] dishes:food) {
			for(String dish:dishes) {
				System.out.print(dish + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		
		for(int i=0; i<food.length; i++) {
			for(int j=0; j<food[i].length; j++) {
				System.out.println(food[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}

	}

}
