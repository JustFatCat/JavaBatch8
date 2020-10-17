package reviewJavaClass01;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		//shortcut ctrl+shift+O
		
		/*int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter your age:");
		age = scan.nextInt();
		System.out.println("Your age is " + age);
		
		if(age<=18) {
			System.out.println("You should study");
		}else {
			System.out.println("You should work");
		};*/
		
		System.out.println("----------------------------");
		String name1;
		int age1;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter your name:");
		name1 = scan1.nextLine();
		System.out.println("Please enter your age:");
		age1 = scan1.nextInt();
		System.out.println("Hi " + name1 + " you are " + age1 + " years old!");
		
	}

}
