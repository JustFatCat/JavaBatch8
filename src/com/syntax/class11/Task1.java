package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		// presidents
		String[][] array = {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		System.out.println (array[0][0] + " " + array[1][0]);
		System.out.println (array[0][0] + " " + array[1][3]);
		System.out.println (array[0][2] + " " + array[1][2]);
		System.out.println (array[0][3] + " " + array[1][1]);
	
		
		//cars
			
		  System.out.println("------------------");
		  String[][] cars = { 
				  {"american", "german", "korean", "italian"},
				  {"Jeep", "Ferrari", "BMW", "Sonata"}
		  };
		  for(int i = 0; i<cars.length; i++) {
			  for(int a = 0; a<cars[i].length; a++) {
				  String carName = cars[i][a];
				  System.out.print(carName + " ");
			  }
			  System.out.println(" ");
			  
		  }
		  
		  System.out.println("---------------------");
		 for(String[] carArray:cars) {
			 for(String car:carArray) {
				 System.out.println(car + " ");
			 }
			 System.out.println("");
		 }

	}

}
