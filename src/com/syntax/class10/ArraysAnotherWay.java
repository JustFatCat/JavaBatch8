package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		//

		String[] names = { "Mike", "Burju", "Jack", "Natasha", "Bryan" };

		// String[] name;
		// name = {"Sabeen"}; this way we can't do, in two steps

		System.out.println(names[3]);

		// how do I know how many elements I have in array

		int size = names.length;
		System.out.println("Size of names array = " + size);

		System.out.println(names[names.length - 2]);// Natasha

		int a = 2;
		System.out.println(names[a]);// Jack

		a += 2;
		System.out.println(names[a]);// Brian

		System.out.println("---------------------------------------");

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println("---------------------------------------");

		for (int i = 0; i <= names.length; i++) {//we will get an exception because length will be 6 and highest index we have 5
			System.out.println(names[i]);
		}
		
		for(int i = 0; i<=names.length-1; i++) {//to fix that we should use -1
			System.out.println(names[i]);
		}

	}

}
