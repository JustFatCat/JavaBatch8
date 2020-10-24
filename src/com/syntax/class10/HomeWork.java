package com.syntax.class10;

public class HomeWork {

	public static void main(String[] args) {
		// sum of integers

		int[] array = { 10, 5, 15 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);

		// array of animals

		String[] animals = { "Cat", "Dog", "Mouse", "Bird", "Wolf", "Hamster" };
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		for (String animal : animals) {
			System.out.print(animal + " ");
		}
		System.out.println("");
		System.out.println("------------------------------");

		// array of doubles
		double result = 0;
		double[] arr = { 11.2, 56.5, 66.0, 10.5 };
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		System.out.println(result);

		System.out.println("--------------------------");

		// array of countries
		String[] countries = { "France", "Russia", "Italia", "USA" };
		String[] capitals = { "Paris", "Moscow", "Rome", "Washington" };

		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i] + " " + capitals[i]);
		}

		int a = 0;
		for (String country : countries) {
			System.out.print(country + " " + capitals[a] + "; ");
			a++;
		}
		//another way
		System.out.println("");
		System.out.println("----------------------------------------");
		
		String capital;
		for(String country1:countries) {
			switch(country1) {
			case "France": 
				capital = "Paris";
				break;
			case "Russia":
				capital = "Moscow";
				break;
			case "Italia":
				capital = "Rome";
				break;
			case "USA":
				capital = "Washington";
				break;
			default:
				capital = "I don't know";
			}
			System.out.println("Capital of " + country1 + " is " + capital);
		}
		
	}

}
