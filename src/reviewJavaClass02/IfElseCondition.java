package reviewJavaClass02;

public class IfElseCondition {

	public static void main(String[] args) {
		int a = 0;

		/*
		 * System.out.println("This will be printed always");
		 * 
		 * if(a>0) { System.out.println("Number is greater that zero"); } else {
		 * 
		 * } To comment out a big block of code you should use ctrl+shift+/(this is
		 * forward slash) To uncomment your block of code you should use
		 * ctrl+shift+/(this is backward slash)
		 */

		/*
		 * System.out.println("This will be printed always");
		 * 
		 * if (a >= 0) { System.out.println("Number is greater than zero"); } else {
		 * System.out.println("Number is less than zero"); }
		 * System.out.println("This will be printed always");
		 */
		System.out.println("This will be printed always");

		if (a > 0) {
			System.out.println("Number is greater than zero");
		} else if (a < 0) {
			System.out.println("Number is less than zero");
		} else {
			System.out.println("Number is zero");
		}

		System.out.println("This will be printed always");

	}

}
